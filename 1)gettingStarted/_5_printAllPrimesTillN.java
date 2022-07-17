import java.util.Scanner;

public class _5_printAllPrimesTillN{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the lower input of the range: ");
    int low = scn.nextInt();    
    System.out.print("Enter the higher input of the range: ");
    int high = scn.nextInt();    
    scn.close();

    for(int i = low; i<=high; i++){
      primeOrNot(i);
    }

  }

  static void primeOrNot(int num){
    boolean flag = true;
    for(int j = 2; j*j <= num; j++){
      if(num % j == 0 ){
        flag = false;
        break;
      }
    }

    if(flag){
      System.out.println(num);
    }
  }
}