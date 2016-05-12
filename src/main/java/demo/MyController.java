package demo;

import demo.model.SmallThing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luk on 2016-05-12.
 */
@RestController
public class MyController {

    @RequestMapping("/view")
    public SmallThing view_or_text() {
        return new SmallThing();
    }
}
