package com.ljupcho.graphqlexample.graphql.repo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
public class User {

  @Id
  @GeneratedValue
  private UUID uuid;
  private String name;
//  private List<Post> posts;
//  private List<Subscriber> subscribers;

}
