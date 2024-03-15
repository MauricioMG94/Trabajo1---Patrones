
/**
 * The Address class represents a physical address with attributes for address,
 * city, country, and zip
 * code.
 */
public class Address {
    private String address;
    private String city;
    private String country;
    private String zipCode;

    public Address(String address, String city, String country, String zipCode) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address [ address=" + address + ", city=" + city + ", country=" + country + ", zipCode=" + zipCode + "]";
    }

}
