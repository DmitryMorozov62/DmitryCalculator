package DmitryCalculator;

public interface Calculator {
    Integer answerPlus(Integer num1, Integer num2);
    Integer answerMinus(Integer num1, Integer num2);
    Integer answerMultiply(Integer num1, Integer num2);
    Double answerDivide(Double num1, Double num2);
    boolean nullPointerException(Integer num1, Integer num2);
    boolean nullPointerException(Double num1, Double num2);

}
