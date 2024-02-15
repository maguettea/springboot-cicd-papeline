package com.maxdev.sn.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private int etat;
    @OneToMany(mappedBy = "user")
    private List<Lieu> lieux=new ArrayList<>();
    @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinTable(name="user_roles",
            joinColumns={@JoinColumn(name="idU", referencedColumnName = "id", nullable =false, updatable = false, insertable = false)},
            inverseJoinColumns= {@JoinColumn(name="idR", referencedColumnName = "id", nullable = false, updatable= false, insertable = false)})
    private List<Roles> roles= new  ArrayList<Roles>();




    public User(){
           super();

    }

     public User(int id, String nom, String prenom, String email,String password,int etat) {this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.etat = etat;
        
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
     public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom =prenom;
    }
     public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email =email;
    }


     public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password =password;
    }

     public int getEtat() {

           return etat;
    }
    public void setEtat(int etat) {

           this.etat =etat;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}


