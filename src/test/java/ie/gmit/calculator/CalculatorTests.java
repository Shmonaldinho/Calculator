package ie.gmit.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTests {
    Calculator Calc = new Calculator();

    @Test
    void addTest(){
        assertEquals(10, Calc.add(5,5));
    }

    @Test
    void multiplyTest(){
        assertEquals(10, Calc.multiply(2,5));
    }

    @Test
    void subtractTest(){
        assertEquals(1, Calc.subtract(5,4));
    }

/*    @Test
    void divideTest(){
        assertEquals(5, Calc.divide(10,2));
    }*/

}
