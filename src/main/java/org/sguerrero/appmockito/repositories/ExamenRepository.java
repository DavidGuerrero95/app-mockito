package org.sguerrero.appmockito.repositories;

import org.sguerrero.appmockito.models.Examen;

import java.util.List;

public interface ExamenRepository {

    List<Examen> findAll();

    Examen guardar(Examen examen);
}
