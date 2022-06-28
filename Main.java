
public class Main {
    public static void main(String[] args) {
        LineComparison obj = new LineComparison();
        double lengthOne = obj.calculateLength(6, 7, 9, 8);
        double lengthTwo = obj.calculateLength(5, 4, 7, 5);
        System.out.println("Length of Line 1 is: " + lengthOne);
        System.out.println("Length of Line 2 is: " + lengthTwo);
        obj.checkLineEquality(lengthOne, lengthTwo);
        obj.checkLineComparison(lengthOne, lengthTwo);

    }
}