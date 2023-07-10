package com.project.upload.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.upload.model.Student;

public interface SaveStudentRepository extends CrudRepository<Student, Integer> {

}
