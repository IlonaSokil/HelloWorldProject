package tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetProduct {
    public long id;
    public String name;
    public String status;
}