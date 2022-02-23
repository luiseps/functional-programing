package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Place {

    private String placeName;
    private String longitude;
    private String state;
    private String stateAbbreviation;
    private String latitude;

    public Place(){
        super();
    }

    public Place(String placeName, String longitude, String state, String stateAbbreviation, String latitude) {
        this.placeName = placeName;
        this.longitude = longitude;
        this.state = state;
        this.stateAbbreviation = stateAbbreviation;
        this.latitude = latitude;
    }

    @JsonProperty("place name")
    public String getPlaceName() {
        return placeName;
    }

    @JsonProperty("place name")
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state abbreviation")
    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    @JsonProperty("state abbreviation")
    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(placeName, place.placeName) && Objects.equals(longitude, place.longitude) && Objects.equals(state, place.state) && Objects.equals(stateAbbreviation, place.stateAbbreviation) && Objects.equals(latitude, place.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeName, longitude, state, stateAbbreviation, latitude);
    }
}
