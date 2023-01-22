package Service;
import Bean.Email;
import Bean.User;
import Exception.UserExccption;

import java.util.List;

public interface UserService {
    public String AddCreateUser(User user) throws UserExccption ;
    public User GetUserDetails(int userid) throws UserExccption;
    public String deleteUser(int userid) throws UserExccption;
public List<User> GetAllUser() throws UserExccption;
}
