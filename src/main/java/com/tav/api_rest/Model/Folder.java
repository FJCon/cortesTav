package com.tav.api_rest.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DIS_MMNN_BWSR_00000200")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecID")
    private Integer id;

    //Relacionar con Jobs por RecID (de job)
    private Integer bwsrId;
    @ManyToOne
    @JoinColumn(name = "RecID")
    private Obra obra;
    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Job> jobs;
}
