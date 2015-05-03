package com.upm.miw.spotify.controllers.ws;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.upm.miw.spotify.view.beans.SessionBean;

public abstract class ControllerWs {

	protected SessionBean session = null;

	public static final String PROTOCOL = "https";

	public static final String HOST = "api.spotify.com";

	//public static final int PORT = 8080;

	public static final String WEB = "/v1/";

	public static final String URI = PROTOCOL + "://" + HOST + /*":" + PORT*/ WEB;

	private static final Logger log = LogManager.getLogger(ControllerWs.class);


	protected boolean operationSuccess = false;

	protected ControllerWs(SessionBean session) {
		this.session = session;
	}

	protected SessionBean getSession() {
		return session;
	}

	/*protected static WsApacheManager buildWebServiceManager(String username,
			String password) {
		log.info("buildWebServiceManager : ", URI.toString());
		return new WsApacheManager(username, password);
	}*/

	protected static WsApacheManager buildWebServiceManager() {
		log.info("buildWebServiceManager : ", URI.toString());
		return new WsApacheManager();
	}
	
	protected String replaceParamUriForValue(String uri,String regex,String replacement) throws UnsupportedEncodingException {
		return uri.replaceAll(regex, URLEncoder.encode(replacement, "UTF-8"));
	}

}
