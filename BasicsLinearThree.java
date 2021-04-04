public class BasicsLinearThree
{
    public static void main(String[] args)
    {
        // takes two command-line arguments of angles in degrees converted from string to double
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[0]);

        // degrees value to radians
        x = Math.toRadians(x);
        y = Math.toRadians(y);

        // calculation of the required mathematical function
        Double result = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) / Math.tan(x * y);

        // Prints calculation result in the terminal window
        System.out.println(result);
    }
}