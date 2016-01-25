package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/sayhi")
    public Greeting sayhi(
            @RequestParam(value="name1") String name1,
            @RequestParam(value="name2", defaultValue="name2") String name2,
            @RequestParam(value="name3", defaultValue="name3") String name3
    ) {
        
        return new Greeting(counter.incrementAndGet(), "hi there"+" "+name1+" "+name2+" "+name3);
    }
}
