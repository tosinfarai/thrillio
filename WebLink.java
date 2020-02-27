/*
 * This class is a subclass of the Bookmark class 
 * Allows users bookmark web links according to the variables declared e.g. url
 */

package com.semanticsquare.thrillio.entities;

public class WebLink extends Bookmark{
	private String url;
	private String host;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
}
