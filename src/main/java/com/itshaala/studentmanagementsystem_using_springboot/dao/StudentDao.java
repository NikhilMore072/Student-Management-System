package com.itshaala.studentmanagementsystem_using_springboot.dao;

import com.itshaala.studentmanagementsystem_using_springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//IT is not neceessary to add the @Repository bcz JPA repository has default implementation class
//i.e. SimpleJpaRepository is a implementation class of JPA Repository
public interface StudentDao extends JpaRepository<Student, Long> {
}
