package com.example.obej4_5y6.Entitis;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor

@Entity
@Table(name="laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer anio;
    private Double price;


}

