package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Management.LibraryManagement.entity.Author;

@Repository
public interface AuthorRepository  extends JpaRepository<Author,Integer>{

}
