import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for the first line:");

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for the second line:");
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        System.out.print("Enter x4: ");
        double x4 = scanner.nextDouble();
        System.out.print("Enter y4: ");
        double y4 = scanner.nextDouble();

        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        if (length1.equals(length2)) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }
        System.out.printf("Length of Line 1: %.2f\n", length1);
        System.out.printf("Length of Line 2: %.2f\n", length2);
        scanner.close();
    }
}
