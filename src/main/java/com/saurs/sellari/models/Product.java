package com.saurs.sellari.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Product {


  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private Double price;

  @Column(nullable = false)
  private Boolean isPrivate;

  @Column(nullable = false)
  private Department department;

  
}
