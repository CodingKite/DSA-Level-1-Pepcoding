import java.util.Scanner;

public class _2_gradingSystem{
  public static void main(String[] args) {

    _2_gradingSystem obj = new _2_gradingSystem();
    int num = obj.getInput();
    obj.printStatement(num);
  }

  int getInput(){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter an number: ");
    int num = scn.nextInt();
    scn.close();
    
    return num;
  }

  void printStatement(int marks){
    if(marks <= 60){
      System.out.println("below par");
    }else if(marks <= 70){
      System.out.println("meets expectations");
    }else if(marks <= 80){
      System.out.println("fair");
    }else if(marks <= 90){
      System.out.println("good");
    }else{
      System.out.println("excellent");
    }
  }
}