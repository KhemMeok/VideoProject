package khem.mapper;

import javax.annotation.processing.Generated;
import khem.dto.CourseDTO;
import khem.model.CategoryModel;
import khem.model.CourseModel;
import khem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T20:47:01+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Autowired
    private CategoryService categoryService;

    @Override
    public CourseModel toCourse(CourseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourseModel courseModel = new CourseModel();

        if ( dto.getCategoryId() != null ) {
            courseModel.setCategory( categoryService.getById( dto.getCategoryId().longValue() ) );
        }
        courseModel.setActive( dto.getActive() );
        courseModel.setId( dto.getId() );
        courseModel.setName( dto.getName() );

        return courseModel;
    }

    @Override
    public CourseDTO toDTO(CourseModel entity) {
        if ( entity == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        Long id = entityCategoryId( entity );
        if ( id != null ) {
            courseDTO.setCategoryId( id.intValue() );
        }
        courseDTO.setActive( entity.getActive() );
        courseDTO.setId( entity.getId() );
        courseDTO.setName( entity.getName() );

        return courseDTO;
    }

    private Long entityCategoryId(CourseModel courseModel) {
        if ( courseModel == null ) {
            return null;
        }
        CategoryModel category = courseModel.getCategory();
        if ( category == null ) {
            return null;
        }
        Long id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
