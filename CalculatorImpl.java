package DmitryCalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl  implements Calculator {
    @Override
    public String answerPlus(Integer firstNumber, Integer secondNumber) {
        return "<font size=\"20\" color= \"#00FF00\">" +"\""+ firstNumber+" + "+ secondNumber+ " = "+
                (firstNumber + secondNumber)+"\"" +"</font>";
    }

    @Override
    public String answerMinus(Integer firstNumber, Integer secondNumber) {
        return "<font size=\"20\" color= \"#00FF00\">" +"\""+ firstNumber+" - "+ secondNumber+ " = "+
                (firstNumber - secondNumber)+"\"" +"</font>";
    }

    @Override
    public String answerMultiply(Integer firstNumber, Integer secondNumber) {
        return "<font size=\"20\" color= \"#00FF00\">" +"\""+ firstNumber+" * "+ secondNumber+ " = "+
                (firstNumber * secondNumber)+"\"" +"</font>";
    }

    @Override
    public String answerDivide(Double firstNumber, Double secondNumber) {
        if (secondNumber == 0){
            return "<font size=\"20\" color= \"FF0000\">На 0 лучше не делить</font>";
        }
        return "<font size=\"20\" color= \"#00FF00\">" +"\""+ firstNumber.intValue() +" / "+ secondNumber.intValue() + " = "+
                String.format("%.1f",firstNumber / secondNumber) +"\"" +"</font>";
    }

}

