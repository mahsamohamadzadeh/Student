package com.project.upload.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.upload.model.Student;

@Service
public interface IStudentService {
	List<Student> findPaginated(int pageNo,int pageSize);
}
