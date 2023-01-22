package Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tagId;
    private String tagName;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tagsList")
    private List<Post> postList = new ArrayList<>();

    public Tags() {
    }

    public Tags(int tagId, String tagName, List<Post> postList) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.postList = postList;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", postList=" + postList +
                '}';
    }
}
