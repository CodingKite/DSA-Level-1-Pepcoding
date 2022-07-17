import java.util.Scanner;
public class _4_primeOrNot{
  public static void main(String[] args){
    System.out.print("Enter the number of inputs: ");
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();

    for(int i = 0 ; i < num; i++){
      System.out.println("Enter an number: ");
      int digit = scn.nextInt();
      // primeMethod1(digit);
      // primeMethod2(digit);
      optimized_Method_primeOrNot(digit);

    }
    scn.close();

  }

  static void optimized_Method_primeOrNot(int n){
    if((n == 1) || (n == 2) || (n == 3) || (n == 5) ) {
      System.out.println("prime");
      return;
    }

    if((n%2==0) || (n%3==0) || (n%5==0)){
      System.out.println("not prime");
      return;
    }

    boolean flag = true;
    for(int i=7; i*i <= n; i++){
      if(n%i==0){
        flag = false;
        break;
      }
    }

    if(flag){
      System.out.println("prime");
    }else{
      System.out.println("not prime");
    }
  
  }

  static void primeMethod2(int digit){
    boolean flag = true;
   
    for(int j = 2; j*j <= digit; j++){
      if(digit % j == 0){
        flag = false;
        break;
      }
    }

    if(flag){
      System.out.println("prime");
    }else{
      System.out.println("not prime");
    }
  }

  static void primeMethod1(int digit){
    boolean flag = true;
   
    for(int j = 2; j < digit; j++){
      if(digit % j == 0){
        flag = false;
        break;
      }
    }

    if(flag){
      System.out.println("prime");
    }else{
      System.out.println("not prime");
    }
  }
}