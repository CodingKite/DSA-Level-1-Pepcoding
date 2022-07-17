import java.util.Scanner;
public class _10_inverseOfaNumber{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    scn.close();

    int inv = getInverseNumber(num);
    System.out.printf("Inverse of a %d is %d", num,inv);
  }

  static int getInverseNumber(int num){
    int inv = 0;
    int index = 1;
    // 426135 -- 416253

    while(num > 0){
      int rem = num % 10;
      int multiplier = (int)Math.pow(10, rem-1);
      inv += (index*multiplier);
      
      num /= 10;
      index++;
    }

    return inv;
  }
}