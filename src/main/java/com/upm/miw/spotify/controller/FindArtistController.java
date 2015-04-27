package com.upm.miw.spotify.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.upm.miw.spotify.models.properties.beans.FindArtistViewPropertiesManager;
import com.upm.miw.spotify.utils.ViewNameConstants;
import com.upm.miw.spotify.utils.ViewUrlConstants;
import com.upm.miw.spotify.view.beans.FindArtistViewBean;

@Controller
public class FindArtistController {
	private static final Logger log = LogManager.getLogger(FindArtistController.class);
	
	
	//atributos autocompletados de esta clase
	//concretamente se autocompleta con los valore de los ficheros .properties de internacionalizacion
	@Autowired
	private FindArtistViewPropertiesManager findArtistViewPropertiesManager;
	
	
	@RequestMapping(value = { ViewUrlConstants.ROOT_PATH+ViewUrlConstants.FIND_ARTIST_PATH}, 
			method = RequestMethod.GET)
	public ModelAndView findArtist() {
		log.info("findArtist GET");
		FindArtistViewBean findArtistViewBean = new FindArtistViewBean(findArtistViewPropertiesManager);
		ModelAndView model = findArtistViewBean.update();
		log.info("filling the bean "+ findArtistViewBean.getName()+":"+"values:"+findArtistViewBean.getMapMsgs().toString());
		model.setViewName(ViewNameConstants.FINDARTIST_VIEWNAME);
		log.info("redirect to "+model.getViewName()+" page ");
		return model;

	}

	

}