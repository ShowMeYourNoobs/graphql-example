package com.ljupcho.graphqlexample;

import com.ljupcho.graphqlexample.graphql.repo.BankAccountRepository;
import com.ljupcho.graphqlexample.graphql.repo.entity.BankAccount;
import com.ljupcho.graphqlexample.graphql.repo.entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class GraphqlExampleApplication {

	@Autowired
	private BankAccountRepository bankAccountRepo;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlExampleApplication.class, args);
	}

	@PostConstruct
	public void bootstrap() {
		var bankAccounts = List.of(BankAccount.builder().name("Ljupcho").currency(Currency.MKD).build(),
				BankAccount.builder().name("Robert").currency(Currency.USD).build(),
				BankAccount.builder().name("Muhammet").currency(Currency.CHF).build(),
				BankAccount.builder().name("Saifullah").currency(Currency.USD).build(),
				BankAccount.builder().name("Rakesh").currency(Currency.SEK).build());
		bankAccountRepo.saveAll(bankAccounts);

		System.out.println("Bank accounts: " + bankAccountRepo.findAll());
	}

}
