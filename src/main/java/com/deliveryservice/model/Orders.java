package com.deliveryservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private Instant orderAcceptedTime = Instant.now();
    private Instant deliveryTime;

    @ManyToOne(fetch = FetchType.EAGER)
    private DeliveryMan deliveryMan;
}
