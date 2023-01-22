package Bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mail_id;
    private String email;
    private LocalDate created_date;
    @OneToOne( mappedBy = "email", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "id")
    private User user;

    public Email() {
    }

    public Email(int mail_id, String email, LocalDate created_date, User user) {
        this.mail_id = mail_id;
        this.email = email;
        this.created_date = created_date;
        this.user = user;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public int getMail_id() {
        return mail_id;
    }

    public void setMail_id(int mail_id) {
        this.mail_id = mail_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mail_id=" + mail_id +
                ", email='" + email + '\'' +
                ", created_date=" + created_date +

                '}';
    }
}


