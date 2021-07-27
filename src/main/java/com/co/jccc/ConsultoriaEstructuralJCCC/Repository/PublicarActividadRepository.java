package com.co.jccc.ConsultoriaEstructuralJCCC.Repository;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.PublicarActividad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicarActividadRepository extends CrudRepository <PublicarActividad, String>{

        @Query("insert into PublicarActividad VALUES 'namePublicar'")
        public PublicarActividad SavePublicacion(@Param("namePublicar") String NombreProyecto);
    }