package UseCases;

import Bean.Post;
import Bean.Tags;
import Service.PostService;
import Service.PostServiceImpl;
import Exception.TagNotFoundException;
import javax.security.sasl.SaslClient;
import java.util.List;
import java.util.Scanner;

public class GetTags {
    public static void main(String[] args) throws TagNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id;");
        int id=sc.nextInt();
        PostService postService=new PostServiceImpl();

       Tags tags= postService.getTags(id);
        if (tags == null) {

            throw new TagNotFoundException("tagId not exist "+id);
        }else {
            List<Post> list = tags.getPostList();
            System.out.println(tags.getTagId());
            System.out.println(tags.getTagName());

          for(Post i:list){
              System.out.println(i.getPostId());
              System.out.println(i.getLastUpdateAt());
              System.out.println(i.getPostedAt());
              System.out.println(i.getTitle());
              System.out.println(i.getLastUpdateAt());
          }
        }
    }
}
