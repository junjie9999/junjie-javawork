package com.qa.demo.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NotNull;
import javax.persistence.Size;
import javax.persistence.Min;
import javax.persistence.Max;



import com.qa.demo.rest.controller.Band;

@Entity
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 55)
    private String name;

    @Min(0)
    @Max(12)
    private Integer strings;

    @NotNull
    private String type;

    @ManyToOne
    private Band band;

    // constructors

    // getters & setters
}


