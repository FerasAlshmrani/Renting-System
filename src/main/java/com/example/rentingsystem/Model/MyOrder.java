package com.example.rentingsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Should be not empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String productName;

    @NotEmpty(message = "Should be not empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String renterName;

    @NotNull(message = "Should be not null")
    @Column(columnDefinition = "int not null")
    private Integer productPrice;

    @NotEmpty(message = "Should be not empty")
    @Column(columnDefinition = "varchar(30) not null")
    private String lessorName;

    private Date endDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="myOrder")
    private Set<Product> products;

    @ManyToOne
    @JoinColumn()
    @JsonIgnore
    private Renter renter;



}