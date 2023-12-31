package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.Set;

public interface FlyRepository extends JpaRepository<FlyEntity,Long> {

    @Query("Select f from fly f where f.price < :price")
    Set<FlyEntity> selectLessPrice(BigDecimal name);

    @Query("Select f from fly f where f.price between :min and :max")
    Set<FlyEntity> selectBetweenPrice(BigDecimal min, BigDecimal max);


    @Query("Select f from fly f where f.originName = :origin and f.destinyName = :destiny")
    Set<FlyEntity> selectOriginDestiny(String origin, String destiny);

}
