package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Management.LibraryManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
