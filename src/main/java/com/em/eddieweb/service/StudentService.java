package com.em.eddieweb.service;

import com.em.eddieweb.dao.StudentMapper;
import com.em.eddieweb.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentService class
 *
 * @author Administrator
 * @date
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public int AddStudent(Student student){
       return studentMapper.insert(student);
    }

}
