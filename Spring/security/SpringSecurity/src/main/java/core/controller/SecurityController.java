package core.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
	
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			String password = "123456";
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);

			System.out.println(hashedPassword);
			i++;
		}
	}

	@RequestMapping(value = "homePage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", getUsername());
		modelAndView.setViewName("homePage");
		return modelAndView;
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam(value = "errorMessage", required = false) String errorMessage) {
		ModelAndView modelAndView = new ModelAndView();
		if (errorMessage != null) {
			modelAndView.addObject("errorMessage", "Invalid username and password!");
		}
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping("logout")
	public ModelAndView logout() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", getUsername() + ", you've been logged out successfully.");
		modelAndView.setViewName("homePage");
		return modelAndView;
	}
	
	@RequestMapping(value = "403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username", getUsername());
		modelAndView.setViewName("403");
		return modelAndView;
	}
	
	private String getUsername() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			return userDetail.getUsername();
		}
		return null;
	}
}
