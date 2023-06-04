package khem.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CategoryModel.class)
public abstract class CategoryModel_ {

	public static volatile SingularAttribute<CategoryModel, String> name;
	public static volatile SingularAttribute<CategoryModel, Boolean> active;
	public static volatile SingularAttribute<CategoryModel, Long> id;

	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String ID = "id";

}

