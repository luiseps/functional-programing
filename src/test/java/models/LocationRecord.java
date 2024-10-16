package models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationRecord(
    @JsonProperty("post code") String postCode,
    @JsonProperty("country") String country,
    @JsonProperty("country abbreviation") String countryAbbreviation,
    @JsonProperty("places") List<PlacesRecord> places) {}

