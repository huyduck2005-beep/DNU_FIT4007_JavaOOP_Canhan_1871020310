import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        b = scanner.nextInt();
        scanner.close();
    }

    public int sum() {
        return a + b;
    }

    public int difference() {
        return a - b;
    }

    public int product() {
        return a * b;
    }

    public double quotient() {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return (double) a / b;
    }

    public void displayResults() {
        System.out.println("Tổng: " + sum());
        System.out.println("Hiệu: " + difference());
        System.out.println("Tích: " + product());
        try {
            System.out.println("Thương: " + quotient());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input();
        calculator.displayResults();
    }
}