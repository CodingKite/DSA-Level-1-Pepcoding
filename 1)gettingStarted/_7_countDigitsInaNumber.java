import java.util.Scanner;

public class _7_countDigitsInaNumber{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter an number: ");
    int num = scn.nextInt();
    scn.close();

    int tempNum = num;
    int digit = 0;
    while(tempNum > 0){
      tempNum /= 10;
      digit++;
    }

    System.out.printf("Number of digits in %d is %d",num,digit);
  }
}