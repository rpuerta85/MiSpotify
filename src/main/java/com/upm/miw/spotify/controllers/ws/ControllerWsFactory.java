package com.upm.miw.spotify.controllers.ws;

import com.upm.miw.spotify.controllers.ControllerFactory;
import com.upm.miw.spotify.controllers.FindArtistController;
import com.upm.miw.spotify.view.beans.SessionBean;


public class ControllerWsFactory extends ControllerFactory {
	private static ControllerWsFactory factory;
	private SessionBean session;
	private FindArtistController findArtistController;

	public ControllerWsFactory(SessionBean session) {
		this.session = session;
	}

	public static ControllerWsFactory getInstance(SessionBean session) {
		if (factory == null) {
			factory = new ControllerWsFactory(session);
		}
		return factory;
	}


	@Override
	public FindArtistController getFindArtistController() {
		if (findArtistController == null) {
			findArtistController = new FindArtistControllerWs(session);
		}
		return findArtistController;
	}

}
