import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
	   System.out.println("Enter two numbers");
     Scanner s = new Scanner(System.in);
	   int first = s.nextInt();
	   int second = s.nextInt();
	   System.out.println(first + " " + second);
	   int sum = first + second;
	   System.out.println("The sum is: " + sum);
	   }
}
