package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John", 85));
		students.add(new Student(2, "Alice", 78));
		students.add(new Student(3, "Bob", 90));
		students.add(new Student(4, "Daisy", 88));
		students.add(new Student(5, "Mike", 95));

		int total = 0;
		for (Student s : students) {
			total += s.getMarks();
		}

		double average = (double) total / students.size();
		System.out.println("Average marks: " + average);
	}

}
