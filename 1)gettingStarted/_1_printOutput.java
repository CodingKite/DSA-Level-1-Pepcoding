import java.util.Scanner;

public class _1_printOutput{
  public static void main(String[] args) {

    _1_printOutput obj = new _1_printOutput();
    obj.printZ();
    System.out.println();
    obj.printPattern();
    System.out.println();

    obj.printZMethod2();

  }

  void printZ(){
    System.out.println("*****");    
    System.out.println("   *");    
    System.out.println("  *");    
    System.out.println(" *");    
    System.out.println("*****");    
  }

  void printZMethod2(){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter an number: ");
    int num = scn.nextInt();
    scn.close();

    for(int i = 1; i <= num; i++){
      if(i == 1 || i == num){
        for(int k = 1;k <= num; k++ ){
          System.out.print("*");
        }
        System.out.println();
      }else{
        for(int j = 1; j<(num-i+1);j++){
          System.out.print(" ");
        }
        System.out.println("*");
      }  
    }

  }

  void printPattern(){
    System.out.println("*\n**\n***\n****\n*****");
  }
  
}

