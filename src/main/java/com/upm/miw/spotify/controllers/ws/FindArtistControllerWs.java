package com.upm.miw.spotify.controllers.ws;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.upm.miw.spotify.controllers.FindArtistController;
import com.upm.miw.spotify.view.beans.SessionBean;
import com.upm.miw.spotify.ws.RestArtistUris;

public class FindArtistControllerWs extends ControllerWs implements
		FindArtistController {
	private static final Logger log = LogManager.getLogger(FindArtistControllerWs.class);


	public FindArtistControllerWs(SessionBean session) {
		super(session);

	}


	@Override
	public String findArtistJSON(String artist) {
		log.info("begin findArtistJSON");
		log.info("artist received:"+artist);
		WsApacheManager wsApacheManager = ControllerWs.buildWebServiceManager();
		String json = "{}";
		try {
		wsApacheManager.get(replaceParamUriForValue(ControllerWs.URI+RestArtistUris.FIND_ARTIST_REST_URI, RestArtistUris.PARAM, artist));
			log.info("find artist ws URI:" + replaceParamUriForValue(ControllerWs.URI+RestArtistUris.FIND_ARTIST_REST_URI,
					RestArtistUris.PARAM, artist));
			json = wsApacheManager.getJsonResponse();
			log.info("rest response:" + json);
			
		} catch (Exception e) {
			log.error("error response", e);
		}
		log.debug("end creating channel");
		return json;
	}

	

}
