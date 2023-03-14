package DmitryCalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements WelcomeService {

    @Override
    public String answerHello(String name) {
        return  "<p class=\"center\"><font size=\"20\" color= \"#0000FF\">Welcome to Calculator,</font> "
                + "<font size=\"20\" color= \"BA55D3\">" +name+ "</font></p>";
    }

    @Override
    public String hello() {
        return "<p><strong><BLOCKQUOTE><font size=\"20\" color= \"#0000FF\">Welcome!!!</font></BLOCKQUOTE></strong></p>";
    }
}
