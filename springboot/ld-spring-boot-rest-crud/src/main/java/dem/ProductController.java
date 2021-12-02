package dem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
	@GetMapping("/welcome")
	protected String welcome()  {
		System.out.println("WELCOME TO THE WORLD OF SPRING BOOT AND REST API");
		return "<html><head><title>Welcome Servlet</title></head><body><h1>Welcome to the world of springboot............</h1></body></html>";
//		return "WELCOME TO THE WORLD OF SPRING BOOT AND REST API";
	}
}
