public class BasicsLinearSix
{
    public static void main(String[] args)
    {
        // parsing string command-line arguments into integer type X and Y coordinates
        int targetedXCoordinate = Integer.parseInt(args[0]);
        int targetedYCoordinate = Integer.parseInt(args[1]);

        // defining coordinates of the first Rectangle
        // the one UNDER X-axis
        int x1 = -4;
        int y1 = -3;
        int x2 = 4;
        int y2 = 0;
        // the point falls into first Rectangle?
        boolean isInFirstRectangle = (x1 <= targetedXCoordinate && targetedXCoordinate <= x2
                && y1 <= targetedYCoordinate && targetedYCoordinate <= y2);

        // defining coordinates of the second Rectangle
        // the one OVER X-axis
        int x3 = -2;
        int y3 = 0;
        int x4 = 2;
        int y4 = 4;
        // the point falls into second Rectangle?
        boolean isInSecondRectangle = (x3 <= targetedXCoordinate && targetedXCoordinate <= x4
                && y3 <= targetedYCoordinate && targetedYCoordinate <= y4);

        boolean result = (isInFirstRectangle || isInSecondRectangle);

        System.out.println(result);
    }
}