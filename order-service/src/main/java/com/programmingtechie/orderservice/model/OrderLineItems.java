package com.programmingtechie.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_order_line_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_line_items_seq_gen")
    @SequenceGenerator(name = "order_line_items_seq_gen", sequenceName = "t_order_line_items_seq", allocationSize = 1)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
