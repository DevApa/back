package com.core.back.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Carlos Aparicio Vivero
 */
@Controller
public class HomeController {
    @GetMapping({"","/"})
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
