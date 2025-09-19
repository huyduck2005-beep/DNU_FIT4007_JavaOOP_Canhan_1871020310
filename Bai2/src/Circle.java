import java.util.Scanner;

public class Circle {
    private double radius;

    public void inputRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        radius = scanner.nextDouble();
        scanner.close();
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayResults() {
        System.out.printf("Chu vi hình tròn: %.2f%n", circumference());
        System.out.printf("Diện tích hình tròn: %.2f%n", area());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputRadius();
        circle.displayResults();
    }
}