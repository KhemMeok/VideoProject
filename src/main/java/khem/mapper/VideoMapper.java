package khem.mapper;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import khem.dto.VideoDTO;
import khem.model.VideoModel;
import khem.service.CourseService;
import khem.service.UserService;

@Mapper(componentModel = "spring",uses = {CourseService.class,UserService.class})
public interface VideoMapper {

    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);

   
    @Mappings({
        @Mapping(source = "createDate", target = "createDate"),
        @Mapping(source = "dateModified", target = "dateModified"),
         @Mapping(source = "dto.courseId",target = "course"),
        @Mapping(source = "dto.usersCreate",target = "usersCreate"),
        @Mapping(source = "dto.usersModified",target = "usersModified"),
    })
    VideoModel toVideosModel(VideoDTO dto);
    @Mappings({
    @Mapping(source = "entity.course.id",target = "courseId"),
    @Mapping(source = "entity.usersCreate.id",target = "usersCreate"),
    @Mapping(source = "entity.usersModified.id",target = "usersModified"),
    @Mapping(source = "entity.createDate", target = "createDate"),
    @Mapping(source = "entity.dateModified", target = "dateModified"),
    })
    VideoDTO toVIdeoDTO(VideoModel entity);
    
    default Date stringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        try {
            return (Date) dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
     
}
