package khem.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseModel.class)
public abstract class CourseModel_ {

	public static volatile SingularAttribute<CourseModel, String> name;
	public static volatile SingularAttribute<CourseModel, Boolean> active;
	public static volatile SingularAttribute<CourseModel, Long> id;
	public static volatile SingularAttribute<CourseModel, CategoryModel> category;

	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String CATEGORY = "category";

}

