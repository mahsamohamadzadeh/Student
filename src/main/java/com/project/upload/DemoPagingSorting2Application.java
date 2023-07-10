package com.project.upload;

import java.io.File;

import com.project.upload.controller.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPagingSorting2Application {

	public static void main(String[] args) {
		
		new File(myController.uploadDirectory).mkdir();
		
		SpringApplication.run(DemoPagingSorting2Application.class, args);
	}

}
