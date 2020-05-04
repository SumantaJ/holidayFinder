package com.holidays.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "DateDetails")
public class DateDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String iso;
    private int year;
    private int month;
    private int day;

    @OneToOne(mappedBy="date")
    private HolidayDataModel holiday;

}
