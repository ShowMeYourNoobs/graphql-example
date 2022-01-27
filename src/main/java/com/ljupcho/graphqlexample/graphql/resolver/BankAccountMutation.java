package com.ljupcho.graphqlexample.graphql.resolver;

import com.ljupcho.graphqlexample.graphql.repo.BankAccountRepository;
import com.ljupcho.graphqlexample.graphql.repo.entity.BankAccount;
import com.ljupcho.graphqlexample.graphql.resolver.input.CreateBankAccountInput;
import io.leangen.graphql.annotations.GraphQLMutation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BankAccountMutation {

  private BankAccountRepository bankAccountRepo;

  @GraphQLMutation(name = "createBankAccount")
  public BankAccount createBankAccount(CreateBankAccountInput createBankAccountInput) {
    BankAccount bankAccount = BankAccount.builder()
        .name(createBankAccountInput.getName())
        .currency(createBankAccountInput.getCurrency())
        .build();
    return bankAccountRepo.save(bankAccount);
  }

}
