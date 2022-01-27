package com.ljupcho.graphqlexample.graphql.repo.entity;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BankAccount.class)
public abstract class BankAccount_ {

	public static volatile SingularAttribute<BankAccount, String> name;
	public static volatile SingularAttribute<BankAccount, Currency> currency;
	public static volatile SingularAttribute<BankAccount, UUID> uuid;

	public static final String NAME = "name";
	public static final String CURRENCY = "currency";
	public static final String UUID = "uuid";

}

