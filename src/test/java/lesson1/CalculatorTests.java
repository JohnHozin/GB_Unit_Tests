package lesson1;

import lesson1.lection1.Calculator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTests {

    @Test
    void evaluatesExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 2, '+')).isEqualTo(4);
    }

    @Test
    void subtractionExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(4, 2, '-')).isEqualTo(2);
    }

    @Test
    void multiplicationExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(3, 2, '*')).isEqualTo(6);
    }

    @Test
    void divisionExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(8, 2, '/')).isEqualTo(4);
    }

    @Test
    void expectedIllegalStateExpressionOnInvalidOperatorSymbol() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.calculation(8, 4, '_')).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void getOperandCompletesCorrectWithNumbers() {
        String testedValue = "9";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);

        Calculator.getOperand();

        System.out.println(testedValue);
        System.setIn(inputStream);
    }

    @Test
    void getOperandCompletesCorrectWithNotNumbers() {
        String testedValue = "k";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(() -> Calculator.getOperand()).isInstanceOf(IllegalStateException.class).describedAs("Ошибка в вводимых данных");

        System.setIn(inputStream);
        System.setOut(null);
    }
}
