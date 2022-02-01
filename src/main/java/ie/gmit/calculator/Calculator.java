package ie.gmit.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    int result = 0;

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);
    }

    public Calculator(){

    }
    public int add(int num1, int num2){
        result = num1 + num2;

        return result;
    }

    public int multiply(int num1, int num2){
        result = num1 * num2;

        return result;
    }

    public int subtract(int num1, int num2){
        result = num1 - num2;

        return result;
    }

    public int divide(int num1, int num2){
        result = num1/num2;

        return result;
    }
}

