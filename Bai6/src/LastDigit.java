import java.util.Scanner;

public class LastDigit {
    private int number;

    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên N: ");
        number = scanner.nextInt();
        scanner.close();
    }

    public int getLastDigit() {
        return Math.abs(number % 10);
    }

    public void displayLastDigit() {
        System.out.println("Chữ số cuối cùng của số " + number + " là: " + getLastDigit());
    }

    public static void main(String[] args) {
        LastDigit lastDigit = new LastDigit();
        lastDigit.inputNumber();
        lastDigit.displayLastDigit();
    }
}