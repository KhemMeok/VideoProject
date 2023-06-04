package khem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import khem.dto.CourseDTO;
import khem.model.CourseModel;
import khem.service.CategoryService;

@Mapper(componentModel = "spring",uses = {CategoryService.class})
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Mapping(source = "dto.categoryId",target = "category")
    CourseModel toCourse(CourseDTO dto);

   @Mapping( source = "entity.category.id",target = "categoryId")
   CourseDTO toDTO(CourseModel entity);
}
