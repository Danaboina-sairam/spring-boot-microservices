package com.programmingtechie.inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_seq_gen")
    @SequenceGenerator(name = "inventory_seq_gen", sequenceName = "inventory_seq", allocationSize = 1)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
