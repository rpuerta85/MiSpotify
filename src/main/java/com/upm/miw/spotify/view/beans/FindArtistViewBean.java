package com.upm.miw.spotify.view.beans;

import org.springframework.web.servlet.ModelAndView;


public class FindArtistViewBean extends GenericView{

	//private CommonsPropertiesManager commonsPropertiesManager

	private boolean success = false;

	

	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public FindArtistViewBean() {
		super();
	}

	
	public ModelAndView update() {
		ModelAndView model = new ModelAndView();
		this.setMsgs();

		model.addObject("findArtistViewBean", this);
		return model;
	}


	@Override
	protected void setMsgs() {
		this.mapMsgs.put("key1","hola");
		// TODO Auto-generated method stub
		
	}


}
