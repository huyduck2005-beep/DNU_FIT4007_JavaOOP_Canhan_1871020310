import java.util.Scanner;

public class Student {
    private int age;
    private final int currentYear = 2023;

    public void inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của sinh viên tính đến năm 2023: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public int calculateBirthYear() {
        return currentYear - age;
    }

    public void displayBirthYear() {
        System.out.println("Năm sinh của sinh viên là: " + calculateBirthYear());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.inputAge();
        student.displayBirthYear();
    }
}