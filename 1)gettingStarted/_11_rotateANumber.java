import java.util.Scanner;

public class _11_rotateANumber{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter an number: ");
    int n = scn.nextInt();
    System.out.print("Number of rotation: ");
    int k = scn.nextInt();
    scn.close();

    int temp = n;
    int nod = 0;

    while(temp > 0 ){
      nod++;
      temp /= 10;
    }
 
    k %= nod; //k -= nod; k /= nod; are WRONG. we alays do this bcuz k could be an larger negative or positive integer

    if(k < 0){
      k += nod;
    }

    int rem = n % (int)Math.pow(10, k);
    int quo = n / (int)Math.pow(10, k);

    int rotatenum = (rem * (int)Math.pow(10, nod-k)) + quo;
    System.out.println("rotated num - "+rotatenum);

  }
}