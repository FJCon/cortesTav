package com.tav.api_rest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @Column(name = "CNC") // Assuming CNC is a unique identifier
    private String cnc;

    @ManyToOne
    @JoinColumn(name = "JobRef", referencedColumnName = "jobRef") // Ensure it references the correct column
    @JsonBackReference
    private Job job;

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