package com.discografica.api.discos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@CrossOrigin

@Document("discos")
public class Disco {
    @Id
    public String id;

    public String idArtista;

    public String nombre;

    public int anioLanzamiento;

    public List<String> canciones;
}
