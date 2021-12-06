package dem.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController {
public String login() {
// use the login repository
// handle the relevant exceptions to avoid unhandled exceptions.
	return "SUCCESS/FAILURE";
}
}
