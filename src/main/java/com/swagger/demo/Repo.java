package com.swagger.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//testing the stash
//testing merge
//123
@Repository
public interface Repo extends JpaRepository<User, Integer> {

}
