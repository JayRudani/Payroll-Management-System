package com.project.PayrollManagementSystem.repository;

import com.project.PayrollManagementSystem.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select * from User u where u.username = ?1 AND cast(aes_decrypt(unhex(`password`),'secret')as char(50)) = ?2",nativeQuery=true)
	List<User> findByUserName(String username, String password);
}
