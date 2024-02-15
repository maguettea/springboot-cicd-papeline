package com.maxdev.sn.controller;

import com.maxdev.sn.dao.ILieu;
import com.maxdev.sn.dao.IUser;
import com.maxdev.sn.entities.Lieu;
import com.maxdev.sn.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class LieuController {
    @Autowired
    private ILieu lieudao;
    @Autowired
    private IUser userdao;
    @RequestMapping(value = "/Lieu/liste")
    //a chaque qu'on veut passer plusieurs informations de notre controller vers la view on utilise le modelmap
    //si on veut passer une seule variable on peut utilise modelview
    public String liste(ModelMap model){

        List<Lieu> lieux =lieudao.findAll();
        List<User> users =userdao.findAll();
        model.put("liste_lieux",lieux);
        model.put("liste_users",users);
        model.put("lieu",new Lieu());

        return "lieu/Liste";
    }
    @RequestMapping(value = "/Lieu/add", method = RequestMethod.POST )
    public String add(int id, String nom ,String latitude,String longitude,int idUser){

        Lieu lieu= new Lieu();
        lieu.setId(id);
        lieu.setNom(nom);
        lieu.setLatitude(Double.parseDouble(latitude));
        lieu.setLongitude(Double.parseDouble(longitude));
        User user = new User();
        user=userdao.getOne(idUser);

        lieu.setUser(user);
        
        try{
            lieudao.save(lieu);//ajout oublien mise a jour
            lieudao.flush();
        }catch (Exception ex){
          ex.printStackTrace();
        }
        return "redirect:/Lieu/liste";

     }
     @RequestMapping(value = "/Lieu/delete",method =RequestMethod.GET )
    public String delete(int id){
         try{
             lieudao.delete(lieudao.getOne(id));
             lieudao.flush();
         }catch (Exception ex){
             ex.printStackTrace();

         }
        return  "redirect:/Lieu/liste";
     }
    @RequestMapping(value = "/Lieu/edit",method =RequestMethod.GET )
    public String edit(int id,ModelMap model){
        List<Lieu> lieux =lieudao.findAll();
        List<User> users =userdao.findAll();
        model.put("liste_lieux",lieux);
        model.put("liste_users",users);

        Lieu lieu=lieudao.getOne(id);
        model.put("lieu",lieu);

        return  "lieu/liste";
    }
}
