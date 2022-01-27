package com.ljupcho.graphqlexample.graphql.resolver.input;

import com.ljupcho.graphqlexample.graphql.repo.entity.Currency;
import lombok.Data;

@Data
public class CreateBankAccountInput {

  private String name;
  private Currency currency;

}
