package UseCases;

import Bean.Post;
import Bean.Tags;
import Service.PostService;
import Service.PostServiceImpl;
import Exception.PostNotFoundException;
import javax.security.sasl.SaslClient;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.List;
import java.util.Scanner;

public class GetPost {
    public static void main(String[] args) throws PostNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id;");
        int id=sc.nextInt();
        PostService postService=new PostServiceImpl();

        Post post=postService.getPost(id);
        if(post==null){
            throw new PostNotFoundException("postId not exist "+id);
        }else{
            System.out.println(post.getPostId());
            System.out.println(post.getPostedAt());
            System.out.println(post.getDescription());
            System.out.println(post.getTitle());
            System.out.println(post.getLastUpdateAt());
            List<Tags> tagsList=post.getTagsList();
            tagsList.forEach(s-> System.out.println(s.getTagId()));
            tagsList.forEach(s-> System.out.println(s.getTagName()));


        }

    }
}
