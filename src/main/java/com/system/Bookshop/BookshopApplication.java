package com.system.Bookshop;

import com.system.Bookshop.Service.FilesStorageService;
import jakarta.annotation.Resource;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class BookshopApplication implements CommandLineRunner{

	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		storageService.deleteAll();
		storageService.init();
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
