package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository  extends JpaRepository<HotelEntity,Long> {
}
