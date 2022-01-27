package com.ljupcho.graphqlexample.graphql.conf;

import com.ljupcho.graphqlexample.graphql.resolver.BankAccountMutation;
import com.ljupcho.graphqlexample.graphql.resolver.BankAccountQueries;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class GraphqlConfig {

  private BankAccountQueries bankAccountQueries;
  private BankAccountMutation bankAccountMutation;

  @Bean
  public GraphQL configureGraphqlSchema() {
//    UserService userService = new UserService(); //instantiate the service (or inject by Spring or another framework)
    GraphQLSchema schema = new GraphQLSchemaGenerator()
        .withBasePackages("org.bube.research.spring.graphql") //not mandatory but strongly recommended to set your "root" packages
        .withOperationsFromSingleton(bankAccountMutation) //register the service
        .withOperationsFromSingleton(bankAccountQueries)
        .generate(); //done
    return new GraphQL.Builder(schema)
        .build();
  }

}
