package khem.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import khem.Enum.Gender;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserModel.class)
public abstract class UserModel_ {

	public static volatile SingularAttribute<UserModel, String> phoneNumber;
	public static volatile SingularAttribute<UserModel, Date> joinDate;
	public static volatile SingularAttribute<UserModel, Gender> gender;
	public static volatile SingularAttribute<UserModel, Date> DOB;
	public static volatile SingularAttribute<UserModel, String> photo;
	public static volatile SingularAttribute<UserModel, Boolean> active;
	public static volatile SingularAttribute<UserModel, Long> id;
	public static volatile SingularAttribute<UserModel, String> email;
	public static volatile SingularAttribute<UserModel, String> username;
	public static volatile SingularAttribute<UserModel, String> Password;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String JOIN_DATE = "joinDate";
	public static final String GENDER = "gender";
	public static final String D_OB = "DOB";
	public static final String PHOTO = "photo";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "Password";

}

