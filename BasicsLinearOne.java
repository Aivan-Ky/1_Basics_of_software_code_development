// this code takes three integer command-line arguments 
// and computes value of the following math function
// z=((a-3)*b/2)+c

public class BasicsLinearOne
{
	public static void main(String[] args)
	{
		// initialasing and declaration of variables also parsing value 
		// of command-line arguments into iniger data type 
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int z = ((a - 3) * b / 2) + c;

		// Prints computation result in the terminal window
		// "\n" provides empty line defore system out line
		System.out.println("\nзначение функции z=((a-3)*b/2)+c=" + z);
	}
}