package Demo;

import java.util.Objects;

public class Address {
    private String state;
    private String city;
    private String pincode;
    private String type;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Address address = (Address) o;
//        return Objects.equals(state, address.state) && Objects.equals(city, address.city) && Objects.equals(pincode, address.pincode) && Objects.equals(type, address.type);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(state, city, pincode, type);
//    }
public Address(){

}
    public Address(String state, String city, String pincode, String type) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.type = type;
    }
}
