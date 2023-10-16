package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity, Long> {
}
