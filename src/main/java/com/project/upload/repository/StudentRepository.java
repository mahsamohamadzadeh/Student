package com.project.upload.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.upload.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
