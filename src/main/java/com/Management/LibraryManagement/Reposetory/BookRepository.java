package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Entity Packages
import com.Management.LibraryManagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
