package org.example.nao_talap_test.controller;

import org.example.nao_talap_test.task1_only_console_application.Palindrome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PalindromeController {
    private final Palindrome palindrome;

    public PalindromeController() {
        this.palindrome = new Palindrome();
    }

    @GetMapping("/palindrome")
    public String showPalindromeForm() {
        return "palindrome";
    }

    @PostMapping("/check-palindrome")
    public String checkPalindrome(@RequestParam("inputString") String inputString, Model model) {
        boolean isPalindrome = palindrome.isPalindrome(inputString);
        String resultMessage = isPalindrome ? "Это палиндром!" : "Это не палиндром.";
        model.addAttribute("resultMessage", resultMessage);
        return "palindrome-result";
    }
}
