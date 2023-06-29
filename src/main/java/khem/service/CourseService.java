package khem.service;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import khem.dto.CourseDTO;
import khem.model.CourseModel;

public interface CourseService {
    CourseModel save(CourseDTO entity);
    CourseModel getById(Long id);
    CourseModel Update(Long id,CourseModel source);
    void delete(Long id);
    List<CourseModel> findAll();
    Page<CourseModel> getCoursePage(Map<String,String> param);
}
