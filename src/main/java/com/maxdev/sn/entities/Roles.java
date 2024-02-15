package com.maxdev.sn.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String nom;
    @ManyToMany(mappedBy="roles")
    private List<User> users= new ArrayList<User>();
     
      public Roles(){
        super();
    }

     public Roles (int id,String nom){
        super();
        this.id=id;
        this.nom=nom;
     }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
