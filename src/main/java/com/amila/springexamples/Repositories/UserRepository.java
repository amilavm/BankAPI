package com.amila.springexamples.Repositories;

import com.amila.springexamples.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 * Created by Asus on 23/06/2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByid(Integer id);

    @Query("SELECT v FROM User v WHERE v.accountNumber=?1")
    User findByAccountNumber(long accountNumber);

}
