import java.util.Scanner;
 
class EvenOdd{
  public static void main(String args[])
  {
    int input;
    System.out.print("Input an integer: ");
    Scanner in = new Scanner(System.in);
	try{
		input = in.nextInt();
		if ( (input/2)*2 == input )
      System.out.println("Even");
    else
      System.out.println("Odd");

	}catch(Exception e){
	
		System.out.println("Please enter valid input");

	}	
 
  }
}
