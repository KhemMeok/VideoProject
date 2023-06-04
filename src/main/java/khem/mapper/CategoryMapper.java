package khem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import khem.dto.CategoryDTO;
import khem.model.CategoryModel;

@Mapper
public interface CategoryMapper {
    
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryModel toEntity(CategoryDTO entity);
    
    CategoryDTO toDTO(CategoryModel dto);
}
