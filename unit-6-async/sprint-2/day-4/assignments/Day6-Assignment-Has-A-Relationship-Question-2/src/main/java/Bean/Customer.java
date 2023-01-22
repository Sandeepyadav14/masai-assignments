package Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String mobileNumber;
    private String email;
    @ElementCollection(fetch = FetchType.EAGER)
    @Embedded
    @JoinTable(name="Address",joinColumns = @JoinColumn(name = "customer_id"))
    private List<Address> addressList=new ArrayList<>();

    public Customer() {
    }
    public Customer(int cid, String name, String mobileNumber, String email, List<Address> addressList) {
        this.cid = cid;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.addressList = addressList;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}
