package com.thai.language.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

  // TODO: Bottun to go to quiz

  String greetingMsg = "สวัสดีครับ";

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("greeting", greetingMsg);
    return "home"; // home.html
  }
}