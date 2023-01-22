package Bean;

import javax.persistence.*;
import java.util.Date;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phineNo;
    private String dateOfBirth;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "email_id")
//    @PrimaryKeyJoinColumn
    private Email email;

    public User() {
    }

    public User(int id, String name, String phineNo, String dateOfBirth, Email email) {
        this.id = id;
        this.name = name;
        this.phineNo = phineNo;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhineNo() {
        return phineNo;
    }

    public void setPhineNo(String phineNo) {
        this.phineNo = phineNo;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phineNo='" + phineNo + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email=" + email +
                '}';
    }
}
