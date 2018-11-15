package com.em.eddieweb.dao;

import com.em.eddieweb.domain.Student;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * StudentMapper class
 *
 * @author Administrator
 * @date
 */
@Component
public interface StudentMapper extends Mapper<Student> {
    int save(Student student);
}
