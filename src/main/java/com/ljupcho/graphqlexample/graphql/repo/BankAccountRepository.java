package com.ljupcho.graphqlexample.graphql.repo;

import com.ljupcho.graphqlexample.graphql.repo.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID>, JpaSpecificationExecutor<BankAccount> {

  List<BankAccount> findByNameLikeIgnoreCase(String name);

}
