package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of customer's address
 */
public class Address {
    /**
     * {@link Address#getStreet()}
     */
    @SerializedName("Street")
    private String street;

    /**
     * {@link Address#getStreet()}
     */
    @SerializedName("District")
    private String district;

    /**
     * {@link Address#getNumber()}
     */
    @SerializedName("Number")
    private String number;

    /**
     * {@link Address#getComplement()}
     */
    @SerializedName("Complement")
    private String complement;

    /**
     * {@link Address#getZipCode()}
     */
    @SerializedName("ZipCode")
    private String zipCode;

    /**
     * {@link Address#getCity()}
     */
    @SerializedName("City")
    private String city;

    /**
     * {@link Address#getState()}
     */
    @SerializedName("State")
    private String state;

    /**
     * {@link Address#getCountry()}
     */
    @SerializedName("Country")
    private String country;

    /**
     * @return the city of customer's address
     */
    public String getCity() {
        return city;
    }

    /**
     * {@link Address#getCity()}
     */
    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * @return any complement of customer's address
     */
    public String getComplement() {
        return complement;
    }

    /**
     * {@link Address#getComplement()}
     */
    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }

    /**
     * @return the country of customer's address
     */
    public String getCountry() {
        return country;
    }

    /**
     * {@link Address#getCountry()}
     */
    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * @return the customer's address number
     */
    public String getNumber() {
        return number;
    }

    /**
     * {@link Address#getNumber()}
     */
    public Address setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * @return the state of customer's address
     */
    public String getState() {
        return state;
    }

    /**
     * {@link Address#getState()}
     */
    public Address setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * @return the customer's address
     */
    public String getStreet() {
        return street;
    }

    /**
     * {@link Address#getStreet()}
     */
    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * @return the zip code of customer's address
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * {@link Address#getZipCode()}
     */
    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * {@link Address#getZipCode()}
     */
    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }
}