package DmitryCalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "<p><strong><BLOCKQUOTE><font size=\"20\" color= \"#0000FF\">Welcome!!!</font></BLOCKQUOTE></strong></p>";
    }

    public String helloCalculator() {
        return "<p><strong><BLOCKQUOTE><font size=\"20\" color= \"#0000FF\">Welcome to Calculator!!!</font></BLOCKQUOTE></strong></p>";
    }
}
