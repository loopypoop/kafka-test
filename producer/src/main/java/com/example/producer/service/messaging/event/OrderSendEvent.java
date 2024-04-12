package com.example.producer.service.messaging.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderSendEvent {

    private String productName;
    private String barCode;
    private int quantity;
    private BigDecimal price;

}