package io.github.nazcompile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartPageController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
