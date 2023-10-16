package com.jscode.RestApi.domain.repositories;

import com.jscode.RestApi.domain.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<TicketEntity , UUID> {


}
