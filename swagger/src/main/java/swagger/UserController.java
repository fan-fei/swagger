package swagger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/names/{myName}", method = RequestMethod.GET)
    public String name(@PathVariable String myName) {
        return myName;
    }
}
