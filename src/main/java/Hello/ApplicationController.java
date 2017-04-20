package Hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name),
                            "This is sample response.");
    }
    
    @RequestMapping("/login")
    public Login login(@RequestParam(value="username") String username,
            @RequestParam(value="password") String password) {
        Login login = new Login();
        login.testLogin(username,password);

        return login;
    }

    @RequestMapping("/v1/login")
    public Login loginWithRequest(@RequestBody LoginData input) {
        Login login = new Login();
        if(input!=null){
            login.testLoginWithRequest(input);
        }

        return login;
    }
}
