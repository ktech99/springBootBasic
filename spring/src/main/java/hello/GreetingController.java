package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@controller
public class GreetingController {

  public GreetingController() {
    System.out.println("");
  }

  @GetMapping("/greeting")
  public String greeting(
      @RequestParam(name = "name", required = false, defaultValue = "world") String name,
      Model model) {
    model.addAtribute("name", name);
    return "greeting";
  }
}
