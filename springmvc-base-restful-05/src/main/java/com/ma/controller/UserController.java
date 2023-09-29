package com.ma.controller;

/* *
 * @packing com.ma.controller
 * @author mtc
 * @date 9:56 09 29 9:56
 *
 */

import com.ma.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {


    @GetMapping
    public List<User> page(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println("page = " + page + ", size = " + size);
        return null;
    }
    @PostMapping
    public User save(@RequestBody User user)
    {
        return user;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable("id") Integer id){
        return null;
    }
    @PutMapping
    public User update(@RequestBody User user)
    {
        return null;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable Integer id)
    {
        return null;
    }
    @GetMapping("search")
    public List<User> searchUser(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size,
                           @RequestParam String keyword)
    {
        System.out.println("page = " + page + ", size = " + size + ", keyword = " + keyword);
        return null;
    }




}
