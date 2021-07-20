package com.co.jccc.ConsultoriaEstructuralJCCC.Repository;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.CrearActividad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CrearActividadRepository extends CrudRepository <CrearActividad, String>{

        @Query("insert into PublicarActividad VALUES 'nameA'")
        public CrearActividad PublicarActividad(@Param("nameA") String activityname);
    }