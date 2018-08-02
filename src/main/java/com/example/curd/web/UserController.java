package com.example.curd.web;

import com.example.curd.common.ResponseResult;
import com.example.curd.common.RestResultGenerator;
import com.example.curd.domain.UserEntity;
import com.example.curd.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseResult<List<UserEntity>> getUserList(){
        return RestResultGenerator.genResult(userRepository.findAll(),"成功");
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResponseResult<UserEntity> postUser(HttpServletRequest request,@ModelAttribute UserEntity userEntity){
        return  RestResultGenerator.genResult(userRepository.save(userEntity),"成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseResult<UserEntity> getUser(@PathVariable Integer id){
        return RestResultGenerator.genResult(userRepository.findOne(id),"成功");
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseResult<UserEntity> putUser(@PathVariable Integer id,@ModelAttribute UserEntity userEntity){
        UserEntity u=userRepository.findOne(id);
        u.setUserName(userEntity.getUserName());
        u.setUserAge(userEntity.getUserAge());
        return RestResultGenerator.genResult(userRepository.save(u),"成功");
    }

    @RequestMapping(value = "/",method = RequestMethod.DELETE)
    public ResponseResult<UserEntity> deleteUser(@PathVariable Integer id){
        return RestResultGenerator.genResult("成功");
    }
}
