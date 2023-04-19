package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Management.LibraryManagement.entity.BookTracking;

@Repository
public interface BookTrackingRepository extends JpaRepository<BookTracking, Integer> {

}
