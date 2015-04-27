package com.upm.miw.spotify.view.beans;

import org.springframework.web.servlet.ModelAndView;

import com.upm.miw.spotify.models.properties.beans.FindArtistViewPropertiesManager;
import com.upm.miw.spotify.views.web.ee.FindArtistViewParamsEE;


public class FindArtistViewBean extends GenericView{
	private static final String NAME = "findArtistViewBean";

	private FindArtistViewPropertiesManager findArtistViewPropertiesManager;

	private boolean success = false;

	

	public FindArtistViewBean(
			FindArtistViewPropertiesManager findArtistViewPropertiesManager) {
		super();
		this.findArtistViewPropertiesManager = findArtistViewPropertiesManager;
	}


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
		model.addObject(NAME, this);
		return model;
	}


	@Override
	protected void setMsgs() {
		this.mapMsgs.put("key1","hola");
		this.mapMsgs.put(FindArtistViewParamsEE.PANEL_HEADER_TITLE.getV(),
				findArtistViewPropertiesManager.getFindArtistViewPanelHeaderTitle());
		this.mapMsgs.put(FindArtistViewParamsEE.PANEL_HEADER_SUBTITLE.getV(),
				findArtistViewPropertiesManager.getFindArtistViewPanelHeaderSubtitle());
		this.mapMsgs.put(FindArtistViewParamsEE.PANEL_HEADER_DESCRIPTION.getV(),
				findArtistViewPropertiesManager.getFindArtistViewPanelHeaderDescription());
		this.mapMsgs.put(FindArtistViewParamsEE.FORM_FIND_ARTIST_LABEL_VALUE.getV(),
				findArtistViewPropertiesManager.getFindArtistViewFormFindArtistLabelValue());
		this.mapMsgs.put(FindArtistViewParamsEE.FORM_FIND_ARTIST_INPUTTEXT_PLACEHOLDER.getV(),
				findArtistViewPropertiesManager.getFindArtistViewFormFindArtistInputTextPlaceholder());
		this.mapMsgs.put(FindArtistViewParamsEE.FORM_FIND_ARTIST_BUTTON_SUBMIT_NAME.getV(),
				findArtistViewPropertiesManager.getFindArtistViewFormFindArtistButtonSubmitName());
		
	}


	public static String getName() {
		return NAME;
	}


}
