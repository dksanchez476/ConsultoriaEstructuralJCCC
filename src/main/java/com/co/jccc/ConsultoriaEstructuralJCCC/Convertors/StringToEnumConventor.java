package com.co.jccc.ConsultoriaEstructuralJCCC.Convertors;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.TypeUser;
import org.springframework.core.convert.converter.Converter;

//convertidor de String a Enum=enumeracion
public class StringToEnumConventor implements Converter<String, TypeUser> {
    @Override
    public TypeUser convert(String str) {
        if(str.equals("Arquitect")){
            return TypeUser.ARQUITECT;
        }else if (str.equals("Engineer")){
            return TypeUser.ENGINEER;
        }else {
            return TypeUser.OTHER;
        }
    }




}