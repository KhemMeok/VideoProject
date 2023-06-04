package khem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import khem.dto.UserDTO;
import khem.model.UserModel;

@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserModel toUser(UserDTO dto);

    UserDTO toUserDTO(UserModel entity);
}
