public class BasicsLinearTwo
{
    public static void main(String[] args)
    {
        // declaration and assignment of values to three variables
        // the value of a, b, c variables is taken from command-line arguments
        // converted from String to the double type
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double result = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (a * a * a * c - Math.pow(b, -2.0));

        System.out.println("\ncalculation result is " + result);
    }
}