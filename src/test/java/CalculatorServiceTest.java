import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    @Test
    void addingTwoNumbers_returnCorrectSum() {

        CalculatorService calculatorService = new CalculatorService();

        double numberOne = 0.1;
        double numberTwo = 0.3;

        calculatorService.numberOne = numberOne;
        calculatorService.numberTwo = numberTwo;

        assertEquals(0.4, calculatorService.add());

    }

    @Test
    void subtractingTwoNumbers_returnCorrectSum () {

        CalculatorService calculatorService = new CalculatorService();

        double numberOne = 5;
        double numberTwo = 2;

        calculatorService.numberOne = numberOne;
        calculatorService.numberTwo = numberTwo;

        assertEquals(3, calculatorService.subtract());

    }

    @Test
    void divideTwoNumbers_returnCorrectSum (){
        CalculatorService calculatorService = new CalculatorService();

        double numberOne = 5;
        double numberTwo = 0;

        calculatorService.numberOne = numberOne;
        calculatorService.numberTwo = numberTwo;

        double sum = numberOne/numberTwo;

        assertEquals(sum, calculatorService.divide());
    }

    @Test
    void multiplyTwoNumbers_returnCorrectSum() {

        CalculatorService calculatorService = new CalculatorService();

        double numberOne = 5;
        double numberTwo = 2;

        calculatorService.numberOne = numberOne;
        calculatorService.numberTwo = numberTwo;

        double sum = numberOne*numberTwo;

        assertEquals(sum, calculatorService.multiply());

    }

    @Test
    void applyDiscountWhenSumExceeds500WithTenPercent(){
        CalculatorService calculatorService = new CalculatorService();

        double sum = 500;
        double discount = 10;

        calculatorService.sum = sum;
        calculatorService.discount = discount;

        assertEquals(450, calculatorService.applyDiscount(sum) );
    }
}
