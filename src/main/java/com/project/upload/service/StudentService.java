package com.project.upload.service;

import java.util.List;

import com.project.upload.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.upload.model.Student;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> findPaginated(int pageNo, int pageSize) {
		Pageable paging=PageRequest.of(pageNo, pageSize) ;
		Page<Student> pagedResult = repository.findAll(paging);
		return pagedResult.toList();
	}
	
}
