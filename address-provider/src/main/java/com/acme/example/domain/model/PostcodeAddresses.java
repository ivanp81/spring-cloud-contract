package com.acme.example.domain.model;

import java.util.List;

public class PostcodeAddresses {
	
	private String latitude;
	private String longitude;
	private List<String> addresses;

	public PostcodeAddresses() {
		super();
	}
 
	public PostcodeAddresses(String latitude, String longitude, List<String> addresses) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.addresses = addresses;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public boolean equals(Object o) {

		if (o == null)
			return false;
		if (!(o instanceof PostcodeAddresses))
			return false;

		PostcodeAddresses other = (PostcodeAddresses) o;
		
		if (!this.latitude.equals(other.latitude))
			return false;
		if (!this.longitude.equals(other.longitude))
			return false;

		return true;
	}

	public int hashCode() {
		return latitude.hashCode() * longitude.hashCode();
	}
}