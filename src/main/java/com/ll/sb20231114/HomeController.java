package com.ll.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/calc") // /calc?a=10&b=10
    @ResponseBody
    String showCalc(int a, int b) {
        return "계산결과 : %d".formatted(a+b);
    }

    @GetMapping("/calc2")
    @ResponseBody
    String showCalc2(Integer a, Integer b) {
        return "a : " + a + " b : " + b;
    }

    @GetMapping("/calc3")
    @ResponseBody
    String showCalc3(
            @RequestParam(defaultValue= "0") int a,
            @RequestParam(defaultValue = "0") int b
    ) {
        return "계산 결과 : %d".formatted(a+b);
    }
    @GetMapping("/calc4")
    @ResponseBody
    String showCalc4(
            @RequestParam(defaultValue= "0") double a,
            @RequestParam(defaultValue = "0") double b
    ) {
        return "계산 결과 : %f".formatted(a+b);
    }
    @GetMapping("/calc5")
    @ResponseBody
    String showCalc5(
            @RequestParam(defaultValue= "-") String a,
            @RequestParam(defaultValue = "-") String b
    ) {
        return "계산 결과 : %s".formatted(a+b);
    }
}
