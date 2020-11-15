import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int operand1 = scanner.nextInt();
        System.out.println("Введите 2 число");
        int operand2 = scanner.nextInt();
        System.out.println("Введите знак для операции +, -, *, /, %");
        String sign = scanner.next();

        switch (sign) {
            case ("+"):
                System.out.println("Сума=" + (operand1 + operand2));
                break;
            case ("-"):
                System.out.println("Разность=" + (operand1 - operand2));
                break;
            case ("*"):
                System.out.println("Произведение=" + (operand1 * operand2));
                break;
            case ("/"): {
                if (operand2 == 0) {
                    System.out.println("Деление на 0 невозможно");
                } else {
                    System.out.println("Результат деления=" + (operand1 / operand2));

                }
            }
        }
    }
}
