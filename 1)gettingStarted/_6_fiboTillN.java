import java.util.Scanner;

public class _6_fiboTillN{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("How many fibo num: ");
    int num = scn.nextInt();
    scn.close();

    int a = 0;
    int b = 1;


    for(int i=0 ; i <num; i++){
      
      System.out.println(a);

      int c = a + b;
      a = b;
      b = c;
      
    }
  }
}