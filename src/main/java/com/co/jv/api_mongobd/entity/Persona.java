package com.co.jv.api_mongobd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Persona")
public class Persona {
    @Id
    private String id;

    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
}
