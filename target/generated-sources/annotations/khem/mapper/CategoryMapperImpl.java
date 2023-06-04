package khem.mapper;

import javax.annotation.processing.Generated;
import khem.dto.CategoryDTO;
import khem.model.CategoryModel;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T20:47:01+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryModel toEntity(CategoryDTO entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setActive( entity.getActive() );
        categoryModel.setId( entity.getId() );
        categoryModel.setName( entity.getName() );

        return categoryModel;
    }

    @Override
    public CategoryDTO toDTO(CategoryModel dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setActive( dto.getActive() );
        categoryDTO.setId( dto.getId() );
        categoryDTO.setName( dto.getName() );

        return categoryDTO;
    }
}
