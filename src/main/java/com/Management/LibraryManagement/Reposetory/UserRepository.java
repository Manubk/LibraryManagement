package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Management.LibraryManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
