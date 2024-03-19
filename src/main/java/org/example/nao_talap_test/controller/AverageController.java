package org.example.nao_talap_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AverageController {

    @GetMapping("/average")
    public String showAverageForm() {
        return "average";
    }

    @PostMapping("/average")
    public String calculateAverage(@RequestParam("numbers") String numbers, Model model) {
        String[] nums = numbers.split(",");
        double sum = 0;
        for (String num : nums) {
            sum += Double.parseDouble(num);
        }
        double average = sum / nums.length;
        model.addAttribute("average", average);
        return "average-result";
    }
}
