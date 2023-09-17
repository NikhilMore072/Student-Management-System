package com.itshaala.studentmanagementsystem_using_springboot.service;

import com.itshaala.studentmanagementsystem_using_springboot.dao.StudentDao;
import com.itshaala.studentmanagementsystem_using_springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{
    @Autowired
    StudentDao studentDao;

    public List<Student> getAllStudents(){
        return studentDao.findAll();
    }

    public Student saveStudent(Student student) {
        return studentDao.save(student);
//Find by Id method returns optional therefore we need to call its get() method
    }

    public Student getStudentById(Long id){
        return studentDao.findById(id).get();
    }

    public Student updateStudent(Student student) {
     return studentDao.save(student);
    }
    public void deleteStudentById(Long id){
        studentDao.deleteById(id);
    }
}
