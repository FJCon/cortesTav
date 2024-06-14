package com.tav.api_rest.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "DIS_MMNN_BWSR_00000200")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecordID")
    private Integer id;

    @Column(name = "BwsrID")
    private Integer bwsrId;

    @OneToMany(mappedBy = "folder")
    private List<Job> jobs;

}
