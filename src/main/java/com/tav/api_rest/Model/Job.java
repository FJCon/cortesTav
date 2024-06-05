package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DIS_MMNN_MMOO_00000200")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecID")
    private Integer id;

    @Column(name = "JobRef")
    private String job;

    @Column(name = "JobName")
    private String info;

    @ManyToOne
    @JoinColumn(name = "JobRef")
    private Nest nest;

}

