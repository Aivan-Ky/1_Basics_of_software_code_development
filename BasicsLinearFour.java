public class BasicsLinearFour
{
    public static void main(String[] args)
    {
        Double r = Double.parseDouble(args[0]);

        // defining integral part of the number 'r'
        int nnn = r.intValue();

        // defining fractional part of the number 'r'
        int ddd = (int) (r * 1000 - nnn * 1000);

        // swapping integral and fractional parts of nnn.ddd real number
        Double result = ddd + ( (double) nnn / 1000);

        System.out.println(result);



    }
}