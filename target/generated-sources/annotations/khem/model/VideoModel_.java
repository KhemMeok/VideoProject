package khem.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VideoModel.class)
public abstract class VideoModel_ {

	public static volatile SingularAttribute<VideoModel, UserModel> usersCreate;
	public static volatile SingularAttribute<VideoModel, UserModel> usersModified;
	public static volatile SingularAttribute<VideoModel, String> link;
	public static volatile SingularAttribute<VideoModel, String> imageCover;
	public static volatile SingularAttribute<VideoModel, CourseModel> course;
	public static volatile SingularAttribute<VideoModel, String> description;
	public static volatile SingularAttribute<VideoModel, Boolean> active;
	public static volatile SingularAttribute<VideoModel, Date> dateModified;
	public static volatile SingularAttribute<VideoModel, Long> id;
	public static volatile SingularAttribute<VideoModel, String> title;
	public static volatile SingularAttribute<VideoModel, Date> createDate;

	public static final String USERS_CREATE = "usersCreate";
	public static final String USERS_MODIFIED = "usersModified";
	public static final String LINK = "link";
	public static final String IMAGE_COVER = "imageCover";
	public static final String COURSE = "course";
	public static final String DESCRIPTION = "description";
	public static final String ACTIVE = "active";
	public static final String DATE_MODIFIED = "dateModified";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String CREATE_DATE = "createDate";

}

