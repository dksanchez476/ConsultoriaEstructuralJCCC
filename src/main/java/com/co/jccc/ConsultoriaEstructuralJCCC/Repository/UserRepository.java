/*
package com.co.jccc.ConsultoriaEstructuralJCCC.Repository;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, String>{

        @Query("select u from User u where u.username=:name")
        public User searchByName(@Param("name") String username);
    }
*/
