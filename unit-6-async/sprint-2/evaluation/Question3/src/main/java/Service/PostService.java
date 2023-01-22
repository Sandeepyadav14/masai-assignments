package Service;

import Bean.Post;
import Bean.Tags;

public interface PostService {
    public void addPost(Post post);
    public Post getPost(int postId);
    public Tags getTags(int tagId);
}
