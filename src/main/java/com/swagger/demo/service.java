package com.swagger.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	Repo repo;

	public User addusers(User user) {
		User save = repo.save(user);
		return save;
	}

	public User getuser(int id) {
User byId = repo.findById(id).get();		
return byId;
	}

	public List<User> getallusers() {
List<User> all = repo.findAll();
System.err.println(all);
		return all;
	}
	

}
