package DmitryCalculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private final WelcomeService helloService;
    private final Calculator calculator;


    public HelloController(WelcomeService helloService, Calculator calculator) {
        this.helloService = helloService;
        this.calculator = calculator;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/calculator")
    public String answerHello(@RequestParam("name") String user){
        return  helloService.answerHello(user);
    }

    @RequestMapping(path = "calculator/plus")
    public String answerPlus(@RequestParam(required = false) Integer num1,
                             @RequestParam(required = false) Integer num2
    ){
        if (num1 == null || num2 == null){
            return "<font size=\"20\" color= \"FF0000\">какой-то из двух параметров (или оба) не поданы</font>";
        }

        return calculator.answerPlus(num1,num2);
    }

    @RequestMapping(path = "calculator/minus")
    public String answerMinus( @RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2
    ){
        if (num1 == null || num2 == null){
            return "<font size=\"20\" color= \"FF0000\">какой-то из двух параметров (или оба) не поданы</font>";
        }
        return calculator.answerMinus(num1,num2);
    }

    @RequestMapping(path = "calculator/multiply")
    public String answerMultiply( @RequestParam(required = false) Integer num1,
                                  @RequestParam(required = false) Integer num2
    ){
        if (num1 == null || num2 == null){
            return "<font size=\"20\" color= \"FF0000\">какой-то из двух параметров (или оба) не поданы</font>";
        }
        return calculator.answerMultiply(num1,num2);
    }

    @RequestMapping(path = "calculator/divide")
    public String answerDivide( @RequestParam(required = false) Double num1,
                                @RequestParam(required = false) Double num2
    ){
        if (num1 == null || num2 == null){
            return "<font size=\"20\" color= \"FF0000\">какой-то из двух параметров (или оба) не поданы</font>";
        }
        return calculator.answerDivide(num1,num2);
    }

}
