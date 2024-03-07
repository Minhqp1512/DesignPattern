package DTOPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<UserModel>{
    private List<UserModel> users= new ArrayList<>();

    public UserDao(){
        UserModel user = new UserModel();
        user.setId(1);
        user.setUserName("minhcoder");
        user.setEmail("minhvn@gmail.com");
        user.setFullName("Minh Coder");
        user.setPassword("1234567");
        user.setBankAccount("9999-9999-9999");
        users.add(user);
    }

    @Override
    public List<UserModel> getAll() {
        return users;
    }

    @Override
    public Optional<UserModel> get(Integer id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void save(UserModel user) {
        users.add(user);
    }

    @Override
    public void update(UserModel userModel) {

    }

    @Override
    public void delete(UserModel userModel) {

    }
}
