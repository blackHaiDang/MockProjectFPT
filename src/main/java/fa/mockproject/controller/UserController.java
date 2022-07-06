package fa.mockproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/login")
  public String login(Model model, String error, String logout) {
    if (error != null) {
      model.addAttribute("error",
          "Sorry, your username or password is incorrect. Please try again!");
    }
    if (logout != null) {
      model.addAttribute("message", "You have been logged out successfully.");
    }
    return "login";
  }


}
