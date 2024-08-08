package com.tav.api_rest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne
    @JoinColumn(name = "NstRef", referencedColumnName = "NstRef") // Ensure it references the correct column
    @JsonBackReference
    private Nest nest;

    @Column(name = "PrdRefDst")
    private String prdRef;

    @Column(name="Quantity")
    private int quantity;

    public Integer getNstId() {
        return nest != null ? nest.getId() : null;
    }
    public Float getNstThickness(){return nest != null ? nest.getThickness() : null;}

}
