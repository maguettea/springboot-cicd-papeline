package com.maxdev.sn.dao;

import com.maxdev.sn.entities.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILieu  extends JpaRepository<Lieu,Integer> {


}
