public class LineComparison {
    public static void main(String[] args) {
        // Creating Points for the first line
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        // Creating Points for the second line
        Point point3 = new Point(0, 0);
        Point point4 = new Point(6, 8);

        // Creating Line objects
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        // Calculate lengths
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        // Compare lengths using equals
        if (line1.equals(line2)) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }

        // Compare lengths using compareTo
        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult < 0) {
            System.out.println("The first line is shorter than the second line.");
        } else if (comparisonResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The two lines are equal in length.");
        }

        // Print lengths
        System.out.printf("Length of Line 1: %.2f\n", length1);
        System.out.printf("Length of Line 2: %.2f\n", length2);
    }
}