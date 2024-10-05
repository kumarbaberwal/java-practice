import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();
        System.out.println("The sum is: " + num1 + num2);
        scanner.close();
    }
}
