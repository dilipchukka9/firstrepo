package com.swagger.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserGraphQLController {
	@Autowired
	service service;

	
	
	  
   
    @QueryMapping
    public User getUser(@Argument int id) {
User getuser = service.getuser(id);
return getuser;

       
    }
    
    @QueryMapping
    public List<User> getAllUser() {
    	System.err.println("hi");
		List<User> allusers=	service.getallusers();
return allusers;

       
    }
    
    


    

    @MutationMapping
    public User createUser(@Argument String name,
                           @Argument int age,
                           @Argument int id) {

        System.out.println("GraphQL user created: " + name);
        User user=  service.addusers(new User(id,name, age));

        return user;
    }
    
   


}
