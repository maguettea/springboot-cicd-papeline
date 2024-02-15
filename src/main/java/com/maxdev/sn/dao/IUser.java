package com.maxdev.sn.dao;





import com.maxdev.sn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository<User,Integer> {

    @Query(name = "SELECT u FROM User u WHERE u.email=:email AND u.password=:password" )
    public User getUserByEmailAndPassword(
            @Param(value = "email") String email,
            @Param(value = "password") String password);


}
