package com.ljupcho.graphqlexample.graphql.resolver;

import com.ljupcho.graphqlexample.graphql.repo.BankAccountRepository;
import com.ljupcho.graphqlexample.graphql.repo.entity.BankAccount;
import com.ljupcho.graphqlexample.graphql.repo.entity.BankAccountSpec;
import com.ljupcho.graphqlexample.graphql.repo.entity.Currency;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BankAccountQueries {

  private BankAccountRepository bankAccountRepo;

  @GraphQLQuery(name = "bankAccounts")
  public List<BankAccount> bankAccounts(@GraphQLArgument(name = "name") String name,
                                        @GraphQLArgument(name = "currency") Currency currency) {
    return bankAccountRepo.findAll(Specification.where(BankAccountSpec.containsName(name)
        .and(BankAccountSpec.hasCurrency(currency))));
  }

}
