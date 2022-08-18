package com.bl.userapplications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bl.userapplications.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User deleteById(int id);
}


