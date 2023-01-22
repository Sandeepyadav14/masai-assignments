package JoinedTable.Bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Hotstar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String rating;
    @Enumerated
    private Subscription subscription;

    public Hotstar(int userId, String userName, String rating, Subscription subscription) {
        this.userId = userId;
        this.userName = userName;
        this.rating = rating;
        this.subscription = subscription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Hotstar{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", rating='" + rating + '\'' +
                ", subscription=" + subscription +
                '}';
    }
}
