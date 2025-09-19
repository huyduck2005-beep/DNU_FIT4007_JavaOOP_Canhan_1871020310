import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        width = scanner.nextDouble();
        scanner.close();
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }

    public void displayResults() {
        System.out.printf("Chu vi hình chữ nhật: %.2f%n", perimeter());
        System.out.printf("Diện tích hình chữ nhật: %.2f%n", area());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.inputDimensions();
        rectangle.displayResults();
    }
}