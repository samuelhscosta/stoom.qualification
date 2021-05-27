package br.com.stoom.qualification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String streetName;
	@Column(nullable = false)
	private String number;
	@Column(nullable = true)
	private String complement;
	@Column(nullable = false)
	private String neighbourhood;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private String country;
	@Column(nullable = false)
	private String zipcode;
	@Column(nullable = true)
	private String latitude;
	@Column(nullable = true)
	private String longitude;
	
	public Adress() {
		
	}
	
	public Adress(long id, String streetName, String number, String complement, String neighbourhood, String city, String state,
			String country, String zipcode, String latitude, String longitude) {
		this.setId(id);
		this.setStreetName(streetName);
		this.setNumber(number);
		this.setComplement(complement);
		this.setNeighbourhood(neighbourhood);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public Adress(long id, String streetName, String number, String neighbourhood, String city, String state,
			String country, String zipcode, String latitude, String longitude) {
		this.setId(id);
		this.setStreetName(streetName);
		this.setNumber(number);
		this.setComplement("");
		this.setNeighbourhood(neighbourhood);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public Adress(long id, String streetName, String number, String complement, String neighbourhood, String city, String state,
			String country, String zipcode) {
		this.setId(id);
		this.setStreetName(streetName);
		this.setNumber(number);
		this.setComplement(complement);
		this.setNeighbourhood(neighbourhood);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		this.setLatitude("");
		this.setLongitude("");
	}
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getComplement() {
		return complement;
	}
	public void setComplement() {
		this.complement = "";
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public String getNeighbourhood() {
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude() {
		this.latitude = "";
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude() {
		this.longitude = "";
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	

}
