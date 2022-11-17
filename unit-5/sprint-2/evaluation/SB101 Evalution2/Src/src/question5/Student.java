package question5;

public class Student {
    int roll;
    String name;
    String email;
    String password;
    Address address;

    class Address {
        String state;
        String city;
        String pincode;

        @Override
        public String toString() {
            return "Address{" +
                    "state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", pincode='" + pincode + '\'' +
                    '}';
        }

//
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

