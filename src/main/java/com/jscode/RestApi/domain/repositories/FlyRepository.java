package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<FlyEntity,Long> {
}
