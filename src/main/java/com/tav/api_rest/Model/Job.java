package com.tav.api_rest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "JobRef", unique = true) // Assuming jobRef is unique
    private String jobRef;

    @Column(name = "JobName")
    private String info;

    /*@ManyToOne
    @JoinColumn(name = "RecId") // columna de Job que es clave primaria, columna folder que es clave foranea
    @JsonBackReference
    private Folder folder;*/

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Nest> nests;

}

