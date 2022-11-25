package org.sguerrero.appmockito.services;

import org.sguerrero.appmockito.models.Examen;

public interface ExamenService {

    Examen findExamenPorNombre(String nombre);

}
