package com.jscode.RestApi.domain.entities;

import com.jscode.RestApi.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Entity(name = "fly")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class FlyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double originLat;
    private double originLng;
    private double destinyLat;
    private double destinyLng;
    private BigDecimal price;
    @Column(length = 20)
    private String originName;
    @Column(length = 20)
    private String destinyName;
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;

}
