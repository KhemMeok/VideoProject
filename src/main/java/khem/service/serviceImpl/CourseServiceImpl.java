package khem.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import khem.Pagenation.filter.CourseFilter;
import khem.Pagenation.specification.CourseSpecification;
import khem.Pagenation.util.PageUtil;
import khem.dto.CourseDTO;
import khem.exceptionHandle.ApiException;
import khem.mapper.CourseMapper;
import khem.model.CourseModel;
import khem.repository.CourseRepository;
import khem.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    
    private final CourseRepository courseRepository;
    
    private final CourseMapper courseMapper;

    @Override
    public CourseModel save(CourseDTO entity) {
        return courseRepository.save(courseMapper.toCourse(entity));
    }

    @Override
    public CourseModel getById(Long id) {
        return courseRepository.findById(id).orElseThrow(
            () -> new ApiException(HttpStatus.NOT_FOUND, String.format("Course not found for id=%d", id)));
    }

    @Override
    public CourseModel Update(Long id, CourseModel source) {
        var target = CourseMapper.INSTANCE.toDTO(getById(id));
        var t2 = CourseMapper.INSTANCE.toCourse(target);
        BeanUtils.copyProperties(source, t2, "id");
        return courseRepository.save(t2);
    }

    @Override
    public void delete(Long id) {
        CourseModel courseModel = getById(id);
        courseModel.setActive(false);
        courseRepository.save(courseModel);
        log.info("category with id=%d is deleted".formatted(id));
    }

    @Override
    public List<CourseModel> findAll() {
        return courseRepository.findByActiveTrue();
    }

    @Override
    public Page<CourseModel> getCoursePage(Map<String, String> param) {
        Pageable pageable = PageUtil.getPageable(param);
        CourseFilter courseFilter = new CourseFilter();
        if(param.containsKey("id")){
            courseFilter.setId(Long.valueOf(MapUtils.getInteger(param, "id")));

        }
        if(param.containsKey("name")){
            courseFilter.setName(MapUtils.getString(param, "name"));
        }
        CourseSpecification courseSpacification = new CourseSpecification(courseFilter);
        Page<CourseModel> page = courseRepository.findAll(courseSpacification, pageable);
        page.getNumberOfElements();
        return page;
    }
    
}
