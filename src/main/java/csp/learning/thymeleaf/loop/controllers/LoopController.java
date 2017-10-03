package csp.learning.thymeleaf.loop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoopController {

    @GetMapping("/nodata")
    public ModelAndView noData() {
        Map<String, List<String>> model = new HashMap<>();
        model.put("vals", new ArrayList<>());

        return new ModelAndView("loop", model);
    }

    @GetMapping("/withdata")
    public ModelAndView withData() {
        Map<String, List<String>> model = new HashMap<>();
        ArrayList<String> vals = new ArrayList<>();
        vals.add("val 1");
        vals.add("val 2");
        vals.add("val 3");
        vals.add("val 4");

        model.put("vals", vals);

        return new ModelAndView("loop", model);

    }
}
