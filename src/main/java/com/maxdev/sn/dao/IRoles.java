package com.maxdev.sn.dao;


import com.maxdev.sn.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IRoles  extends JpaRepository<Roles,Integer> {

}
