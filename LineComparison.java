
<<<<<<< HEAD
public class LineComparison {
    static Scanner sc = new Scanner(System.in);
    static float lengthLine_X = 0;
    static float lengthLine_Y = 0;

    static void compare() {

        if (lengthLine_Y > lengthLine_X) {
            System.out.println("Line 2 is greater than Line 1");
        } else {
            System.out.println("Line 2 is smaller than Line 1");
        }
    }

    static void equals() {
        System.out.println("Enter the value of x4: ");
        float x4 = sc.nextFloat();
        System.out.println("Enter the value of x3: ");
        float x3 = sc.nextFloat();
        System.out.println("Enter the value of y4: ");
        float y4 = sc.nextFloat();
        System.out.println("Enter the value of y3: ");
        float y3 = sc.nextFloat();
        lengthLine_Y = (float) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line 2 is: " + lengthLine_Y);

        if (lengthLine_Y == lengthLine_X) {
            System.out.println("Two lines are equal");
=======

public class LineComparison {
    public double calculateLength(int x1, int y1, int x2, int y2) {
        // Calculating Length of points
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void checkLineEquality(Double lengthOne, Double lengthTwo) {
        boolean equals = lengthOne.equals(lengthTwo);
        if (equals) {
            System.out.println("Lines are Equal");
>>>>>>> UC4-OBJ_METHOD
        } else {
            System.out.println("Lines are not Equal");
        }
    }

<<<<<<< HEAD
    public static void main(String[] args) {

        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();

        lengthLine_X = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line 1 is: " + lengthLine_X);

        equals();
        compare();

=======
    public void checkLineComparison(Double lengthOne, Double lengthTwo) {
        int lineCompare = lengthOne.compareTo(lengthTwo);
        if (lineCompare < 0) {
            System.out.println("Line 1 length is less than line 2");
        } else if (lineCompare > 0) {
            System.out.println("Line 1 length is grater than line 2");
        } else {
            System.out.println("Line 1 length is Equal to line 2");
        }
>>>>>>> UC4-OBJ_METHOD
    }
}