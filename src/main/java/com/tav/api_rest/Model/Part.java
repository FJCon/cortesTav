package com.tav.api_rest.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DIS_NEST_NEST_00000500")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecID")
    private Integer id;

    private String nstRef;

    @Column(name = "PrdRefDst")
    private String prdRef;

    @Column(name="Quantity")
    private int quantity;

}
