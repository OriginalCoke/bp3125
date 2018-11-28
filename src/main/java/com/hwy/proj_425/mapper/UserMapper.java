package com.hwy.proj_425.mapper;

import com.hwy.proj_425.entities.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAllUsers();

    User getUserById(Integer id);

    void createUser(User user);

    void deleteUser(Integer id);
}