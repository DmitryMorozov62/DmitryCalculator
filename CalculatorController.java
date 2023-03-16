package DmitryCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController extends HelloController{
    private final String NULL = "<font size=\"20\" color= \"FF0000\">какой-то из двух параметров (или оба) не поданы</font>";

    public CalculatorController(HelloService helloService, Calculator calculator) {
        super(helloService, calculator);
    }
    @GetMapping
    public String hello() {
        return helloService.helloCalculator();
    }

    @GetMapping("/plus")
    public String answerPlus(@RequestParam(required = false) Integer num1,
                             @RequestParam(required = false) Integer num2
    ){
        return calculator.nullPointerException(num1,num2) ? NULL: "<font size=\"20\" color= \"#00FF00\">" +"\""+ num1+" + "+ num2+ " = "+
                calculator.answerPlus(num1,num2)+"\"" +"</font>"  ;
    }


    @GetMapping(path = "/minus")
    public String answerMinus( @RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2
    ){
        return calculator.nullPointerException(num1,num2) ? NULL: "<font size=\"20\" color= \"#00FF00\">" +"\""+ num1+" - "+ num2+ " = "+
                calculator.answerMinus(num1,num2)+"\"" +"</font>"  ;
    }

    @GetMapping(path = "/multiply")
    public String answerMultiply( @RequestParam(required = false) Integer num1,
                                  @RequestParam(required = false) Integer num2
    ){
        return calculator.nullPointerException(num1,num2) ? NULL: "<font size=\"20\" color= \"#00FF00\">" +"\""+ num1+" * "+ num2+ " = "+
                calculator.answerMultiply(num1,num2)+"\"" +"</font>"  ;
    }

    @GetMapping(path = "/divide")
    public String answerDivide( @RequestParam(required = false) Double num1,
                                @RequestParam(required = false) Double num2
    ) {
        if (num2 == 0) {
            return "<font size=\"20\" color= \"FF0000\">На 0 лучше не делить</font>";
        } else {
        return calculator.nullPointerException(num1,num2) ? NULL: "<font size=\"20\" color= \"#00FF00\">" + "\"" + num1 + " / " + num2 + " = " +
                String.format("%.1f", calculator.answerDivide(num1, num2)) + "\"" + "</font>";
        }
    }
}
