package com.spring.mysql.interfaces;

import com.spring.mysql.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Long> {

}
