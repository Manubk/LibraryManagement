package com.Management.LibraryManagement.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Management.LibraryManagement.entity.BookTracking;

public interface BookTrackingRepository extends JpaRepository<BookTracking, Integer> {

}
