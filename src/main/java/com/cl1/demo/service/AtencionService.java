package com.cl1.demo.service;

import com.cl1.demo.model.Atencion;
import com.cl1.demo.model.Tipo;
import com.cl1.demo.repository.IAtencionRepository;
import com.cl1.demo.repository.ITipoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AtencionService {
    private final ITipoRepository tipoRepository;
    private final IAtencionRepository atencionRepository;

    public List<Atencion> listaAtenciones() {
        return atencionRepository.findAll();
    }

    public Atencion grabar(Atencion atencion) {
        return atencionRepository.save(atencion);
    }

    public List<Tipo> listaTipos() {
        return tipoRepository.findAll();
    }
}
