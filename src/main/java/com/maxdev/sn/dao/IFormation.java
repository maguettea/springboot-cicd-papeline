package com.maxdev.sn.dao;


import com.maxdev.sn.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormation extends JpaRepository<Formation,Integer> {
}
