package com.co.jccc.ConsultoriaEstructuralJCCC.Repository;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.Actividad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CrearActividadRepository extends CrudRepository <Actividad, String>{

        @Query("insert into PublicarActividad VALUES 'nameA'")
        public Actividad PublicarActividad(@Param("nameA") String activityname);
    }