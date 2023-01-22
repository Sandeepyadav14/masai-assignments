package Service;
import Bean.Email;
import Bean.User;
import Exception.UserExccption;
import Util.UtilManager;
import jdk.jshell.execution.Util;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public String AddCreateUser(User user) throws UserExccption {
        String msg=null;
        EntityManager em= UtilManager.provideConnection();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        msg="User Created Successfully....";
        return msg;
    }

    @Override
    public User GetUserDetails(int userid) throws UserExccption {
        EntityManager em=UtilManager.provideConnection();
        em.getTransaction().begin();

        User   user=em.find(User.class,userid);
        em.getTransaction().commit();
        em.close();
        if(user==null){
            throw new UserExccption("Please enter the correct id:"+userid);
        }else{
            return user;
        }

    }

    @Override
    public String deleteUser(int userid) throws UserExccption {
        EntityManager em= UtilManager.provideConnection();
        em.getTransaction().begin();
       User user= em.find(User.class,userid);
       if(user==null){
           throw new UserExccption("User data not deleted..");
       }else{
           em.remove(user);
           em.getTransaction().commit();
           em.close();
           return "User data deleted...";
       }
    }

    @Override
    public List<User> GetAllUser() throws UserExccption {
        EntityManager em=UtilManager.provideConnection();
        em.getTransaction().begin();
        Query query=em.createQuery("from User");
        List<User> users=query.getResultList();
        return users;
    }
}
