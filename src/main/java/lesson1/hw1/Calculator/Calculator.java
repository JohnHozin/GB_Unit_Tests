package lesson1.hw1.Calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculatingDiscount(100, 25));
        System.out.println(calculatingDiscount(100, 100));
//        System.out.println(calculatingDiscount(100, 101));
//        System.out.println(calculatingDiscount(100, -101));
    }

    /*
    Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки
     и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием
      библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
      исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
     */
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Скидка может быть только больше 0% и меньше 100%");
        } else if (purchaseAmount > Double.MAX_VALUE || purchaseAmount < 0) {
            throw new ArithmeticException("Сумма слишком большая или меньше 0");
        }
        return purchaseAmount * (100 - discountAmount) / 100;
    }
}