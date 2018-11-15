package com.em.eddieweb.service.impl;

import com.em.eddieweb.dao.StudentMapper;
import com.em.eddieweb.domain.Student;
import com.em.eddieweb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StudentService class
 *
 * @author Administrator
 * @date
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int save(Student student) {
        return studentMapper.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        Student student= studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public int delete(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Student> getStudentPage() {
        return studentMapper.selectAll();
    }

}
