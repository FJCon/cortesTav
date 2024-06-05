package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "DIS_NEST_NEST_00000100")
public class Nest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecID")
    private Integer id;

    private String cnc;

    /*
    private List<ChangesPart> changes;

*/
    @OneToMany(mappedBy = "nest")
    private List<Job> job;
/*
    private List<Part> part;

    */

    @Column(name = "SThickness")
    private Float thickness;

    @Column(name = "CDate")
    private String created;

    @Column(name = "UData1")
    private String data1;

    @Column(name = "UData2")
    private String data2;

    @Column(name = "UData3")
    private String data3;




}