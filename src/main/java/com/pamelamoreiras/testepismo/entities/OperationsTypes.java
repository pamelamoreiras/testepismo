package com.pamelamoreiras.testepismo.entities;

import com.pamelamoreiras.testepismo.enuns.Description;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OperationsTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Description description;
}
