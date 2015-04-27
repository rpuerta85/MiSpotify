package com.upm.miw.spotify.view.beans;

import org.springframework.web.servlet.ModelAndView;

import com.upm.miw.spotify.utils.ViewUrlConstants;
import com.upm.miw.spotify.views.web.ee.HomeViewParamsEE;


public class HomeViewBean extends GenericView{
	private static final String NAME = "homeViewBean";
	
	public HomeViewBean() {
		super();
	}

	
	public ModelAndView update() {
		ModelAndView model = new ModelAndView();
		setMsgs();
		model.addObject(NAME, this);
		return model;
	}


	@Override
	protected void setMsgs() {
		mapMsgs.put("key1","hola");
		mapMsgs.put(HomeViewParamsEE.BUTTON_FIND_ARTIST_URL.getV(),ViewUrlConstants.FIND_ARTIST_PATH);
		
		// TODO Auto-generated method stub
		
	}


}
