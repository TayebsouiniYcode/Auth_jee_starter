package com.auth.auth_jee_starter.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Transient
    @OneToMany(mappedBy = "role")
    List<Users> usersList;

    public void addUser(Users user) {
        this.usersList.add(user);
        if (user.getRole () != this) {
            user.setRole (this);
        }
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public Role ( Long id , String name ) {
        this.id = id;
        this.name = name;
    }

    public Role ( ) {
    }
    public Role (Long id_role){
        this.id = id_role;
    }

    @Override
    public String toString ( ) {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", usersList="  +
                '}';
    }
}