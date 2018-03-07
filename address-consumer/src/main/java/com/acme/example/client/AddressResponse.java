package com.acme.example.client;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {

	public static final String DUMMY_LATITUDE = "51.390205383300781";
	public static final String DUMMY_LONGITUDE = "-0.13203597068786621";
	
	private String latitude;
	private String longitude;
	private List<String> addresses;

	public AddressResponse() {
		super();
	}
 
	public AddressResponse(String latitude, String longitude, List<String> addresses) {
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
		if (!(o instanceof AddressResponse))
			return false;

		AddressResponse other = (AddressResponse) o;
		
		if (!this.latitude.equals(other.latitude))
			return false;
		if (!this.longitude.equals(other.longitude))
			return false;

		return true;
	}

	public int hashCode() {
		return latitude.hashCode() * longitude.hashCode();
	}
	
	public static AddressResponse makeDummy() throws Exception {

		return new AddressResponse(DUMMY_LATITUDE, DUMMY_LONGITUDE,
				Arrays.asList(new String[] { "10 Watkin Terrace, , , , , Northampton, Northamptonshire",
						"12 Watkin Terrace, , , , , Northampton, Northamptonshire" }));
	}
}