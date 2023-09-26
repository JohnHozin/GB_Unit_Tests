package lesson1;

public class Calculator {
    public static void main(String[] args) {

    }

    public static int calculation(int firstOperand, int
            secondOperand, char operator) {
        int result = 0;
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
                result = firstOperand / secondOperand;
                break;
        }
        return result;
    }

}


