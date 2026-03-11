package com.example.invit_in.food;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String image;
    private Integer price;
}