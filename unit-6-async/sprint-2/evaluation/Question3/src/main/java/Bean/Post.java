package Bean;

import javax.persistence.*;
import javax.swing.text.html.HTML;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
    private String title;
    private String description;
    private Timestamp postedAt;
    private Timestamp lastUpdateAt;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Tags>  tagsList=new ArrayList<>();

    public Post() {
    }

    public Post(int postId, String title, String description, Timestamp postedAt, Timestamp lastUpdateAt, List<Tags> tagsList) {
        this.postId = postId;
        this.title = title;
        this.description = description;
        this.postedAt = postedAt;
        this.lastUpdateAt = lastUpdateAt;
        this.tagsList = tagsList;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Timestamp postedAt) {
        this.postedAt = postedAt;
    }

    public Timestamp getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Timestamp lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public List<Tags> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<Tags> tagsList) {
        this.tagsList = tagsList;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", postedAt=" + postedAt +
                ", lastUpdateAt=" + lastUpdateAt +
                ", tagsList=" + tagsList +
                '}';
    }
}
