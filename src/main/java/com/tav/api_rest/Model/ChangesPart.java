package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Entity
@Table(name="NEST_CHANGE_DATE")
public class ChangesPart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String cnc;

    private String nstRef;

    @Column(name = "UData1")
    private String data1;

    @Column(name = "UData2")
    private String data2;

    @Column(name = "UData3")
    private String data3;

    private String date;

    private String descrip;

    @ManyToOne
    @JoinColumn(name = "NstRef")
    private Nest nest;

}
