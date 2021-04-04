public class BasicsLinearFive
{
    public static void main(String[] args)
    {
        // parsing string command-line argument into integer data type
        int timeInSeconds = Integer.parseInt(args[0]);

        // obtaining minutes and hours quantity
        int convertToMinutes = timeInSeconds / 60;
        int convertToHours = convertToMinutes / 60;

        //
        System.out.format("%02dч %02dмин %02dс", convertToHours, convertToMinutes, timeInSeconds);

        /* Bugs
        amount of seconds will be printed in more then
        two digits if command-line argument exceeds 99 value
         */

    }
}