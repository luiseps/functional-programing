package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Location {

    private String postCode;
    private String country;
    private String countryAbbreviation;
    List<Place> places;

    public Location(){
        super();
    }

    public Location(String postCode, String country, String countryAbbreviation, List<Place> places) {
        this.postCode = postCode;
        this.country = country;
        this.countryAbbreviation = countryAbbreviation;
        this.places = places;
    }

    @JsonProperty("post code")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("post code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country abbreviation")
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlace(List<Place> place) {
        this.places = places;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(postCode, location.postCode) && Objects.equals(country, location.country) && Objects.equals(countryAbbreviation, location.countryAbbreviation) && Objects.equals(places, location.places);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postCode, country, countryAbbreviation, places);
    }
}
