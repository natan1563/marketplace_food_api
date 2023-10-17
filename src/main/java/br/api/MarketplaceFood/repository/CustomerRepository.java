package br.api.MarketplaceFood.repository;

import br.api.MarketplaceFood.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
