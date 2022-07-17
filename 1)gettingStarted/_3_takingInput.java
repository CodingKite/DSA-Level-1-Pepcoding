import java.util.Scanner;
public class _3_takingInput{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    _3_takingInput obj = new _3_takingInput();

    //integer input
    // obj.inputInt(scn);
   
    // single line string input
    // obj.inputString(scn);

    //taking string as well as int input in an single program
    obj.inputIntString(scn);
    
    scn.close();

  }


  void inputInt(Scanner scn){
    System.out.print("Enter an number:");
    int n = scn.nextInt();
    System.out.println("Integer input"+n);
  }

  void inputString(Scanner scn){
    System.out.print("Enter an String:");
    String str = scn.nextLine();
    System.out.println("String input "+str);
  }

  void inputIntString(Scanner scn){
    System.out.print("Enter an number:");
    // we can not use scn.nextInt() here bcuz it will then no take the string input after it.
    int n = scn.nextInt();    
    // int n = Integer.parseInt(scn.nextLine());

    System.out.print("Enter an String:");
    String str = scn.nextLine();

    System.out.println("Integer input "+ n +" String input "+str);
  
  }
}