package in.co.osiris.server;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private static final String format_temperature = "%s, 'Celcius";

    @RequestMapping("/hello")
    public String hello() {
        return "Hey Man! Wassup?";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/temperature/{id}/{temperature}")
    public Temperature temperature(@PathVariable int id, @PathVariable float temperature) {
        return new Temperature(id, temperature);
    }

    // TODO Need to check the string before parsing to float or things will go nutty.

    @RequestMapping("/temperatures/{id}")
    public Temperature temperature(@PathVariable int id, @RequestParam(value="tempe", defaultValue = "0.0") String tempe ) {
        return new Temperature(id, Float.parseFloat(tempe));
    }

//    Send that as a POST with the JSON data in the request body, not in the URL, and specify a content type of application/json.
//    @RequestMapping(path = "/mno/objectKey", method = RequestMethod.POST, consumes = "application/json")
//    public Book getBook(@RequestBody ObjectKey objectKey) {
//        // code here
//    }
}
