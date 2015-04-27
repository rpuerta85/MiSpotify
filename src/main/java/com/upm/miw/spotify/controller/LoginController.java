package com.upm.miw.spotify.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;









import com.upm.miw.spotify.models.properties.beans.HomeViewPropertiesManager;
import com.upm.miw.spotify.utils.ViewNameConstants;
import com.upm.miw.spotify.utils.ViewUrlConstants;
import com.upm.miw.spotify.view.beans.HomeViewBean;

@Controller
public class LoginController {
	private static final Logger log = LogManager.getLogger(LoginController.class);
	//atributos autocompletados de esta clase
	//concretamente se autocompleta con los valore de los ficheros .properties de internacionalizacion
	@Autowired
	private HomeViewPropertiesManager indexViewPropertiesManager;
	
	@RequestMapping(value = { ViewUrlConstants.HOME_VIEW_PATH  , "home","/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {
		log.info("home page");
		HomeViewBean homeViewBean = new HomeViewBean();
		ModelAndView model = homeViewBean.update();
		//model.addObject("title", "Spring Security Login Form - Database Authentication");
		//model.addObject("message", "This is default page!");
		//model.addObject("attributoInyectadoDesdeElProperties", indexViewPropertiesManager.getButtonMoreName());
		
		model.setViewName(ViewNameConstants.HOME_VIEWNAME);
		log.info("redirect to "+model.getViewName()+" page ");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Login Form - Database Authentication");
		model.addObject("message", "This page is for ROLE_ADMIN only!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		//model.setViewName("login");
		model.setViewName("hello");
		return model;

	}
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();
		
		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);
		
			model.addObject("username", userDetail.getUsername());
			
		}
		
		model.setViewName("403");
		return model;

	}

}