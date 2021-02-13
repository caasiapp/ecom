package com.example.demo.Controller;


import com.example.demo.Services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FredagEllerEj {

    @ResponseBody
    @GetMapping("/erdetfredag.dk")

    public String YesOrNo() {
        ErDetFredag erDetFredag = new ErDetFredag();
        return "Er det fredag?<br>" + erDetFredag.erDetFredagUdregner();
    }

}
