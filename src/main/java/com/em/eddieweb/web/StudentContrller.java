package com.em.eddieweb.web;

import com.em.eddieweb.domain.Student;
import com.em.eddieweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * StudentContrller class
 *
 * @author Administrator
 * @date
 */
@Controller
@RequestMapping("/student")
public class StudentContrller {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(){
        Student student=new Student();
        student.setName("eddie");
        student.setAge(29);
        student.setGender(1);
        student.setPhone("13052196606");
        return studentService.AddStudent(student);
    }
}
