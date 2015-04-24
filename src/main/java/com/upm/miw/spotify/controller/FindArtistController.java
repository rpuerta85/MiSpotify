package com.upm.miw.spotify.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.upm.miw.spotify.utils.ViewUrlConstants;
import com.upm.miw.spotify.view.beans.FindArtistViewBean;

@Controller
public class FindArtistController {

	@RequestMapping(value = { "/artista/buscar" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {
		FindArtistViewBean findArtistViewBean = new FindArtistViewBean();
		
		ModelAndView model = findArtistViewBean.update();
		model.setViewName(ViewUrlConstants.FIND_ARTIST);
		return model;

	}

	

}