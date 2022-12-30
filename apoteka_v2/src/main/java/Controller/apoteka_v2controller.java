package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class apoteka_v2controller {

	
	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
}
