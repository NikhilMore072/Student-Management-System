package com.itshaala.studentmanagementsystem_using_springboot;

import com.itshaala.studentmanagementsystem_using_springboot.dao.StudentDao;
import com.itshaala.studentmanagementsystem_using_springboot.model.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemUsingSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemUsingSpringBootApplication.class, args);
    }

@Autowired
    StudentDao studentDao;
    @Override
    public void run(String... args) throws Exception {


//        Student student1 = new Student(1l,"Hena","Parshi","hena@gmail.com");
//        studentDao.save(student1);
//
//        Student student2 = new Student(2l,"Nikhil","More","nik@gmail.com");
//        studentDao.save(student2);
//
//        Student student3 = new Student(3l,"Sandesh","Dongardive","san@gmail.com");
//        studentDao.save(student3);
//
//        Student student4 = new Student(4l,"Vikas","Vishwakarma","vik@gmail.com");
//        studentDao.save(student4);
//
//        Student student5 = new Student(5l,"Priya","Kumari","pri@gmail.com");
//        studentDao.save(student5);
//
//        Student student6 = new Student(6l,"Swara","Kumarii","swa@gmail.com");
//        studentDao.save(student6);


    }
}
