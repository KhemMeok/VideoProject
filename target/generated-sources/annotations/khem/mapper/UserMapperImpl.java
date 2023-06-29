package khem.mapper;

import javax.annotation.processing.Generated;
import khem.dto.UserDTO;
import khem.model.UserModel;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T20:47:01+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toUser(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setActive( dto.getActive() );
        userModel.setDOB( dto.getDOB() );
        userModel.setEmail( dto.getEmail() );
        userModel.setGender( dto.getGender() );
        userModel.setId( dto.getId() );
        userModel.setJoinDate( dto.getJoinDate() );
        userModel.setPassword( dto.getPassword() );
        userModel.setPhoneNumber( dto.getPhoneNumber() );
        userModel.setPhoto( dto.getPhoto() );
        userModel.setUsername( dto.getUsername() );

        return userModel;
    }

    @Override
    public UserDTO toUserDTO(UserModel entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setActive( entity.getActive() );
        userDTO.setDOB( entity.getDOB() );
        userDTO.setEmail( entity.getEmail() );
        userDTO.setGender( entity.getGender() );
        userDTO.setId( entity.getId() );
        userDTO.setJoinDate( entity.getJoinDate() );
        userDTO.setPassword( entity.getPassword() );
        userDTO.setPhoneNumber( entity.getPhoneNumber() );
        userDTO.setPhoto( entity.getPhoto() );
        userDTO.setUsername( entity.getUsername() );

        return userDTO;
    }
}
