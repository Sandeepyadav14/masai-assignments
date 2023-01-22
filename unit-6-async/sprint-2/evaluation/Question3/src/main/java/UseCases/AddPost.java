package UseCases;

import Bean.Post;
import Bean.Tags;
import Service.PostService;
import Service.PostServiceImpl;
import Util.MangerEvalution;


import javax.persistence.EntityManager;
import java.sql.Timestamp;
import java.util.Date;

public class AddPost {
    public static void main(String[] args) {
        Post post = new Post();
        Date date = new Date();
        post.setPostedAt(new Timestamp(date.getTime()));
        post.setDescription("Good Morining");
        post.setTitle("WakeUp Time... ");
        post.setLastUpdateAt(new Timestamp(date.getTime()));

        Tags tags = new Tags();
        tags.setTagName("Sandeep");

        Tags tags2 = new Tags();
        tags2.setTagName("Kuldeep");

        Tags tags3 = new Tags();
        tags3.setTagName("Rudra");

        Tags tags4 = new Tags();
        tags4.setTagName("Ujjawal");
        post.getTagsList().add(tags);
        post.getTagsList().add(tags2);

        post.getTagsList().add(tags3);

        post.getTagsList().add(tags4);

        PostService postService=new PostServiceImpl();
        postService.addPost(post);


    }
}
