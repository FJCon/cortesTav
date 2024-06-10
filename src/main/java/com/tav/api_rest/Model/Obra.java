package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "DIS_MMNN_BWSR_00000100")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Obra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  nodeId;

    @Column(name = "NodeName")
    private String name;

    private Integer parentId;

    private String nodeName;

    /*@OneToMany(mappedBy = "obra")
    private List<Folder> folders;*/
}
