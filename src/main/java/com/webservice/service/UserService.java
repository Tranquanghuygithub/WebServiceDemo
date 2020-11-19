package com.webservice.service;

import com.webservice.dao.UserDAO;
import com.webservice.entity.UserEntity;
import com.webservice.mapper.UserMapper;
import com.webservice.model.User;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@CacheConfig
public class UserService {
    @Autowired
    UserDAO userDAO;

    public void addUser(User user) {
        userDAO.addUser(UserMapper.convertToEntity(user));
    }

    public void updateUser(User user) {
        userDAO.updateUser(UserMapper.convertToEntity(user));

    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Cacheable("user")
    public User getUserById(int id) {
        UserEntity user = userDAO.getUserById(id);
        return UserMapper.convertToDTO(user);

    }
    @CacheEvict("user")
    public void refreshAllProduct(){

    }


    @Cacheable(value = "users")
  //  @CacheEvict(value="users", allEntries=true)// xoa bo nho cache
    // ktra "users trong cache xem co chua. Neu chua . thuc hien va luu kq vao cache
    public List<User> getAllUsers() {
        List<UserEntity> listUserEntity = userDAO.getAllUsers();
        List<User> listUser = new ArrayList<>();
        for (UserEntity userEntity : listUserEntity) {
            User user = UserMapper.convertToDTO(userEntity);
            listUser.add(user);
        }
        return listUser;
    }

}
