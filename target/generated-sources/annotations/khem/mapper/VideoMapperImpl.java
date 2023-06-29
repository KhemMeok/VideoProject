package khem.mapper;

import javax.annotation.processing.Generated;
import khem.dto.VideoDTO;
import khem.model.CourseModel;
import khem.model.UserModel;
import khem.model.VideoModel;
import khem.service.CourseService;
import khem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T20:47:01+0700",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class VideoMapperImpl implements VideoMapper {

    @Autowired
    private CourseService courseService;
    @Autowired
    private UserService userService;

    @Override
    public VideoModel toVideosModel(VideoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VideoModel videoModel = new VideoModel();

        videoModel.setCreateDate( dto.getCreateDate() );
        videoModel.setDateModified( dto.getDateModified() );
        if ( dto.getCourseId() != null ) {
            videoModel.setCourse( courseService.getById( dto.getCourseId().longValue() ) );
        }
        if ( dto.getUsersCreate() != null ) {
            videoModel.setUsersCreate( userService.getById( dto.getUsersCreate().longValue() ) );
        }
        if ( dto.getUsersModified() != null ) {
            videoModel.setUsersModified( userService.getById( dto.getUsersModified().longValue() ) );
        }
        videoModel.setActive( dto.getActive() );
        videoModel.setDescription( dto.getDescription() );
        videoModel.setId( dto.getId() );
        videoModel.setImageCover( dto.getImageCover() );
        videoModel.setLink( dto.getLink() );
        videoModel.setTitle( dto.getTitle() );

        return videoModel;
    }

    @Override
    public VideoDTO toVIdeoDTO(VideoModel entity) {
        if ( entity == null ) {
            return null;
        }

        VideoDTO videoDTO = new VideoDTO();

        Long id = entityCourseId( entity );
        if ( id != null ) {
            videoDTO.setCourseId( id.intValue() );
        }
        Long id1 = entityUsersCreateId( entity );
        if ( id1 != null ) {
            videoDTO.setUsersCreate( id1.intValue() );
        }
        Long id2 = entityUsersModifiedId( entity );
        if ( id2 != null ) {
            videoDTO.setUsersModified( id2.intValue() );
        }
        videoDTO.setCreateDate( entity.getCreateDate() );
        videoDTO.setDateModified( entity.getDateModified() );
        videoDTO.setActive( entity.getActive() );
        videoDTO.setDescription( entity.getDescription() );
        videoDTO.setId( entity.getId() );
        videoDTO.setImageCover( entity.getImageCover() );
        videoDTO.setLink( entity.getLink() );
        videoDTO.setTitle( entity.getTitle() );

        return videoDTO;
    }

    private Long entityCourseId(VideoModel videoModel) {
        if ( videoModel == null ) {
            return null;
        }
        CourseModel course = videoModel.getCourse();
        if ( course == null ) {
            return null;
        }
        Long id = course.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityUsersCreateId(VideoModel videoModel) {
        if ( videoModel == null ) {
            return null;
        }
        UserModel usersCreate = videoModel.getUsersCreate();
        if ( usersCreate == null ) {
            return null;
        }
        Long id = usersCreate.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityUsersModifiedId(VideoModel videoModel) {
        if ( videoModel == null ) {
            return null;
        }
        UserModel usersModified = videoModel.getUsersModified();
        if ( usersModified == null ) {
            return null;
        }
        Long id = usersModified.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
