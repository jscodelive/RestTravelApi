package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
