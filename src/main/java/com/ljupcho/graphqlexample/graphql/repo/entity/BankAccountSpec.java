package com.ljupcho.graphqlexample.graphql.repo.entity;

import org.springframework.data.jpa.domain.Specification;

public class BankAccountSpec {

  public static Specification<BankAccount> containsName(String name) {
    return name == null
        ? ((root, query, builder) -> builder.conjunction())
        : ((root, query, builder) -> builder.like(builder.lower(root.get(BankAccount_.NAME)), "%" + name.toLowerCase() + "%"));
  }

  public static Specification<BankAccount> hasCurrency(Currency currency) {
    return currency == null
        ? ((root, query, builder) -> builder.conjunction())
        : ((root, query, builder) -> builder.equal(root.get(BankAccount_.CURRENCY), currency));
  }

}
