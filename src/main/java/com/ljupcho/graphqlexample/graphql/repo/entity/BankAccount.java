package com.ljupcho.graphqlexample.graphql.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

  @Id
  @GeneratedValue
  private UUID uuid;
  private String name;
  @Enumerated(EnumType.STRING)
  private Currency currency;
}
