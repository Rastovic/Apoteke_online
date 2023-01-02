package apoteka.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Rest {
	
	
	@GetMapping("/hello")
	public String sayhello() {
		return "hello world";
	}

}
