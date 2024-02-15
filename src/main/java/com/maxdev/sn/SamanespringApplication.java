package com.maxdev.sn;



import com.maxdev.sn.dao.IUser;
import com.maxdev.sn.entities.Roles;

import com.maxdev.sn.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SamanespringApplication {

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SamanespringApplication.class, args);

		/*Roles roles =new Roles();
		roles.setId(1);
		roles.setNom("ROLE_USER");

		User user  =new User();
		user.setId(2);
		user.setNom("seck");
		user.setPrenom("Pabi");
		user.setEmail("pabi@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);

		List<Roles> roless=new ArrayList<>();
		roless.add(roles);
		user.setRoles(roless);

		IUser iUser= ctx.getBean(IUser.class);
		try{

			iUser.save(user);
			System.out.println("ok");
		}catch (Exception e){
			e.printStackTrace();

		}
		/*IRoles iRoles = ctx.getBean(IRoles.class);
		try{
			iRoles.saveAndFlush(roles);
			System.out.println("ok");
		}catch (Exception e){

		}*/


		/*IUser iUser= ctx.getBean(IUser.class);
		User user  =new User();
		user.setId(1);
		user.setNom("Kane");
		user.setPrenom("Maguette");
		user.setEmail("maguettekanea@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		try{

			  iUser.save(user);
			  System.out.println("ok");
		}catch (Exception e){
			e.printStackTrace();

		}*/

	}


}
