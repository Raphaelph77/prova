package com.Raphael.Prova.Repository;

import com.Raphael.Prova.ENTITY.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Estudante, Long> {

}
