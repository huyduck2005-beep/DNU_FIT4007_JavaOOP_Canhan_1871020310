import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public void inputSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c = scanner.nextDouble();
        scanner.close();
    }

    public boolean isValid() {
        // Kiểm tra tính hợp lệ của tam giác theo bất đẳng thức tam giác
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double s = perimeter() / 2; // nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // công thức Heron
    }

    public void displayResults() {
        if (!isValid()) {
            System.out.println("Ba cạnh không tạo thành một tam giác hợp lệ.");
            return;
        }
        System.out.printf("Chu vi tam giác: %.2f%n", perimeter());
        System.out.printf("Diện tích tam giác: %.2f%n", area());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.inputSides();
        triangle.displayResults();
    }
}