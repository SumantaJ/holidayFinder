package com.holidays.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "holiday")
public class HolidayDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @OneToOne
    @JoinColumn(name="id")
    private DateDetails date;

    private String type;


}
