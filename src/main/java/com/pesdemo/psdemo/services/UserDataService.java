package com.pesdemo.psdemo.services;

import com.pesdemo.psdemo.models.UserData;
import com.pesdemo.psdemo.repositories.UserDataRepositeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDataService {
    @Autowired
    private UserDataRepositeries userDataRepositeries;


    //getting all record by using the method findAll() of CrudRepository
    public List<UserData> getAllData()
            {
               List<UserData> users = new ArrayList<UserData>();
               users.addAll(userDataRepositeries.findAll());
               return users;
            }
            // end


    //getting a specific record by using the method findById() of CrudRepository
    public UserData getUserById(long id)
              {
                return userDataRepositeries.findById(id).get();
              }


    //saving a specific record by using the method save() of CrudRepository
    public void save(UserData user)
            {
               userDataRepositeries.save(user);
            }
            // end


    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(long id)
             {
                 userDataRepositeries.deleteById(id);
             }
             // end


    //updating a record
    public void update(UserData users)
            {
                 userDataRepositeries.save(users);
            }
            // end

}
