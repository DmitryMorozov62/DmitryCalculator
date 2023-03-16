package DmitryCalculator;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    protected final HelloService helloService;
    protected final Calculator calculator;


    public HelloController(HelloService helloService, Calculator calculator) {
        this.helloService = helloService;
        this.calculator = calculator;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }


}
