package com.webservice.mapper;

import com.webservice.entity.UserEntity;
import com.webservice.model.User;

public class UserMapper {
    public static UserEntity convertToEntity(User user){
        UserEntity userEntity= new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPhone(user.getPhone());
        userEntity.setAge(user.getAge());
        return userEntity;
    }
    public static User convertToDTO(UserEntity userEntity){
        User user= new User();
        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        user.setEmail(userEntity.getEmail());
        user.setPhone(userEntity.getPhone());
        user.setAge(userEntity.getAge());
        return user;

    }
}
