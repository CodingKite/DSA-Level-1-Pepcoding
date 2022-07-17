import java.util.Scanner;
public class _9_reverseofaNumber{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter an number: ");
    int num = scn.nextInt();
    scn.close();

    while(num>0){
      int rem = num % 10;
      System.out.println(rem);
      num /= 10;
    }
  }
}