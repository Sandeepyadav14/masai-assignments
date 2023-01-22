package Service;

import Bean.Post;
import Bean.Tags;
import Util.MangerEvalution;

import javax.persistence.EntityManager;

public class PostServiceImpl implements  PostService {
    @Override
    public void addPost(Post post) {
        EntityManager em= MangerEvalution.provideConnection();
        if(post==null){
            System.out.println("data not valid....");
        }else{
            em.getTransaction().begin();
            em.persist(post);
            em.getTransaction().commit();
            em.close();
            System.out.println("data added..");
        }

    }

    @Override
    public Post getPost(int postId) {
        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        Post post= em.find(Post.class,postId);
        em.getTransaction().commit();
        em.close();
        return post;
    }

    @Override
    public Tags getTags(int tagId) {
        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        Tags tags= em.find(Tags.class,tagId);

        em.getTransaction().commit();
        em.close();
        return tags;

    }
}
