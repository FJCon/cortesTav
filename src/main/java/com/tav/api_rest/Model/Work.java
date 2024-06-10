package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DIS_MMNN_BWSR_00000100")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  nodeId;

    private Integer parentId;

    private String nodeName;

    /*@OneToMany(mappedBy = "obra")
    private List<Folder> folders;*/
}
