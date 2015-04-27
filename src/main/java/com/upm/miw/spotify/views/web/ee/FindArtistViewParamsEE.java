package com.upm.miw.spotify.views.web.ee;


public enum FindArtistViewParamsEE {
	
	PANEL_HEADER_TITLE("panelHeaderTitle"),PANEL_HEADER_SUBTITLE("panelHeaderSubTitle"),
	PANEL_HEADER_DESCRIPTION("panelHeaderDescription"),FORM_FIND_ARTIST_LABEL_VALUE("formFindArtistLabelValue"),
	FORM_FIND_ARTIST_INPUTTEXT_PLACEHOLDER("formFindArtistInputTextPlaceholder"),
	FORM_FIND_ARTIST_BUTTON_SUBMIT_NAME("formFindArtistButtonSubmitName");
	private String v;

	private FindArtistViewParamsEE(String v) {
		this.v = v;
	}

	public String getV() {
		return v;
	}

}
