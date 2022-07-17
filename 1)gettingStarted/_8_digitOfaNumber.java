import java.util.Scanner;
public class _8_digitOfaNumber{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    scn.close();

    _8_digitOfaNumber obj = new _8_digitOfaNumber();

    int digit = obj.findNumberOfDigit(num);
    obj.printDigitOfaNumber(num,(int)Math.pow(10, digit-1));

  }

  int findNumberOfDigit(int num){
    int digit = 0;

    while(num>0){
      num /=10;
      digit++;
    }

    return digit;
  }

  void printDigitOfaNumber(int dividend,int divisor){
    while(divisor > 0){
      int quo = dividend / divisor;
      System.out.println(quo);

      dividend = dividend % divisor;
      divisor /=10;
      
    }
  }
}