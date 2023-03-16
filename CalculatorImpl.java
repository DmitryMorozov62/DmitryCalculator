package DmitryCalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl  implements Calculator {
    @Override
    public Integer answerPlus(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public Integer answerMinus(Integer firstNumber, Integer secondNumber) {
        return (firstNumber - secondNumber);
    }

    @Override
    public Integer answerMultiply(Integer firstNumber, Integer secondNumber) {
        return (firstNumber * secondNumber);
    }

    @Override
    public Double answerDivide(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public boolean nullPointerException(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return true;
        }return false;
    }

    @Override
    public boolean nullPointerException(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return true;
        }return false;
    }
}

