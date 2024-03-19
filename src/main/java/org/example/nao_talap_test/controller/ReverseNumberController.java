package org.example.nao_talap_test.controller;

import org.example.nao_talap_test.task1_only_console_application.ReverseNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReverseNumberController {
    private final ReverseNumber reverseNumber;

    public ReverseNumberController() {
        this.reverseNumber = new ReverseNumber();
    }

    @GetMapping("/reverse-number")
    public String showReverseNumberForm() {
        return "reverse-number";
    }

    @PostMapping("/reverse")
    public String reverseNumber(@RequestParam("inputNumber") int inputNumber, Model model) {
        int reversedNumber = reverseNumber.reverseNumber(inputNumber);
        model.addAttribute("reversedNumber", reversedNumber);
        return "reverse-number-result";
    }

}