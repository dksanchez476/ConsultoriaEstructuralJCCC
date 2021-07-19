package com.co.jccc.ConsultoriaEstructuralJCCC.Beans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class User {

    @Id
    private int id;
    @Pattern(regexp = "(([a-zA-Z0-9]).{5,10})", message = "{username.cannot.be.less.than.five.characters}")
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private TypeUser gender;

    @NotNull(message = "{not.null}")
    private String activity;


    @Pattern(regexp = "(([a-zA-Z]).{3,10})", message = "{error.nombre}")
    private String firstName;

    @Pattern(regexp = "(([a-zA-Z]).{3,10})", message = "{lastname.number}")
    private String lastName;

    @NotNull(message = "{date.null}")
    @NotNull(message = "{date.null}")
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeUser getGender() {
        return gender;
    }

    public void setGender(TypeUser gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

