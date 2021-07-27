package com.co.jccc.ConsultoriaEstructuralJCCC.Convertors;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.TipoIdentificacion;
import org.springframework.core.convert.converter.Converter;

//convertidor de String a Enum=enumeracion
public class StringToEnumConventor implements Converter<String, TipoIdentificacion> {
    
    @Override
    public TipoIdentificacion convert(String str) {
        if(str.equals("Cedula")){
            return TipoIdentificacion.CEDULA;
        }else if (str.equals("Cedula extranjera")){
            return TipoIdentificacion.CEDULAEXTRANJERA;
        } else if (str.equals("Pasaporte")){
            return TipoIdentificacion.PASAPORTE;
        }
        else {
            return TipoIdentificacion.OTHER;
        }
    }




}