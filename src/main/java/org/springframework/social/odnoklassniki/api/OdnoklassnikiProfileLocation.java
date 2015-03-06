package org.springframework.social.odnoklassniki.api;

/**
 * @author Anton Rudenko.
 * "location": {
"city": "Rostov-on-Don",
"country": "RUSSIAN_FEDERATION",
"countryCode": "RU",
"countryName": "Russia"
},
 */
public class OdnoklassnikiProfileLocation {
    private String city;
    private String country;
    private String countryCode;
    private String countryName;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
