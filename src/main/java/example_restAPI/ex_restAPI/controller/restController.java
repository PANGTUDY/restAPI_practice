package example_restAPI.ex_restAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class restController {

    @GetMapping("/multiple")
    public String hello(@RequestParam("number") Integer number, Model model){
        model.addAttribute("number",number);
        model.addAttribute("answer",number * number);
        return "hello-template";
    }
}
