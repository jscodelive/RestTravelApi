package com.jscode.RestApi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TicketEntity {

    @Id
    private UUID id;
    private BigDecimal price;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private LocalDateTime purchaseDate;

    @ManyToOne
    @JoinColumn(name="fly_id")
    private FlyEntity fly;

    @ManyToOne
    @JoinColumn(name="tour_id" , nullable = true)
    private TourEntity tour;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;


}
