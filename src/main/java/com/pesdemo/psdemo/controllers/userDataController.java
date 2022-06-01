package com.pesdemo.psdemo.controllers;

import com.pesdemo.psdemo.models.UserData;
import com.pesdemo.psdemo.services.UserDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/userData")
public class userDataController {
    @Autowired
    private UserDataService userService;

    public userDataController(UserDataService userService)
    {
        this.userService = userService;
    }



    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping
    public List<UserData> getAllUserData()
         {
          return userService.getAllData();
         }
         // end getMapping method

    //creating post mapping that post the book detail in the database
    @PostMapping
    public long saveUserData(@RequestBody  UserData user)
         {
         userService.save(user);
         return user.getId();
         }
         // end postMapping


    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/{id}")
    private UserData getBooks(@PathVariable("id") long id)
          {
         return userService.getUserById(id);
          }
         // end


    //creating  delete mapping that deletes a specified book
    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id") long id)
          {
          userService.delete(id);
          }
          // end

    //creating put mapping that updates the book detail
    @PutMapping
    private UserData update(@RequestBody UserData users)
          {
           userService.update(users);
           return users;
           }
           // end

}
