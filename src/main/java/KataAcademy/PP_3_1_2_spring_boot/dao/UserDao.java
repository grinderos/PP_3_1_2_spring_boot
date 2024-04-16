package KataAcademy.PP_3_1_2_spring_boot.dao;

import KataAcademy.PP_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getUsers();

    User getUserById(long id);

    void deleteUser(long id);
    /*
    Далее идут вспомогательные методы, чтоб не лазить каждый раз в Workbench
    */

    void truncateTable();

    void fillUsersTable();

}
