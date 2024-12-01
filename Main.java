package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int operand1 = scanner.nextInt();

        System.out.println("Введите желаемую операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0); 

        System.out.print("Введите второе число: ");
        int operand2 = scanner.nextInt();

        int result = 0;
        boolean validChoice = true;

        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Ошибка: деление на 0");
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Ошибка: укажите операцию (+, -, *, /)");
                validChoice = false;
        }

        if (validChoice) {
            System.out.println("Результат операции: " + result);
        }

        scanner.close();
    }
}
