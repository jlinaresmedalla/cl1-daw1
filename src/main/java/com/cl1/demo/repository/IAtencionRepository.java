package com.cl1.demo.repository;

import com.cl1.demo.model.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAtencionRepository extends JpaRepository<Atencion, Integer> {
}
