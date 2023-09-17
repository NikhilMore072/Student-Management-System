package com.itshaala.studentmanagementsystem_using_springboot.controller;

import com.itshaala.studentmanagementsystem_using_springboot.model.Student;
import com.itshaala.studentmanagementsystem_using_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
@Autowired
    StudentService studentService;

@GetMapping("/students")
    public String getAllStudent(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        //create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
//        @ModelAttribute is use to bind the form data into student entity
            studentService.saveStudent(student);
            return "redirect:/students";
    }

//    Write Handler Method to handle the Update Request
//    we write the path variable annotation to get the id
    @GetMapping("students/edit/{id}")
        public String editStudentForm(@PathVariable Long id, Model model){
            model.addAttribute("student",studentService.getStudentById(id));
            return "edit_student";
        }
//write a handler mathod to handle student form request
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
            @ModelAttribute("student") Student student,
            Model model){
//    get Student from database by id
        Student exitstingStudent = studentService.getStudentById(id);
        exitstingStudent.setId(student.getId());
        exitstingStudent.setFirstName(student.getFirstName());
        exitstingStudent.setLastName(student.getLastName());
        exitstingStudent.setEmail(student.getEmail());

//    save updated student object
        studentService.updateStudent(exitstingStudent);
        return "redirect:/students";
    }

//    Create a handler method to delete the student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
