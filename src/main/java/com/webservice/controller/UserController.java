package com.webservice.controller;

import com.webservice.model.User;
import com.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@Controller
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/viewUser")
    public List<User> getAllUser(Model model) {
        // @ResponseBody chuyen doi  cai kiểu trả về sang dạng json ỏ xml tùy theo yeu cau gửi lên
        List<User> listUser = userService.getAllUsers();
        model.addAttribute("listUser", listUser);
        return listUser;
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public void themUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @DeleteMapping(value = "/deleteUser/{id}")
  //  @ResponseStatus(code = HttpStatus.OK)
    public void deleteUser(@PathVariable(name = "id") int id) {
          userService.deleteUser(id);
    }
    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable(name = "id") int id){
        return userService.getUserById(id);
    }
    @PutMapping(value = "/update")
    @ResponseStatus(code = HttpStatus.OK)
    public void update(@RequestBody User user){
        userService.updateUser(user);
    }

}
