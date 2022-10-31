package com.auth.auth_jee_starter.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "firstname doesn't take a null value")
    @Column(name = "firstname")
    private String firstname;

    @NotNull(message = "last_name doesn't take a null value")
    @Column(name = "lastname")
    private String lastname;

    @NotNull(message = "email doesn't take a null value")
    @Column(name = "email")
    private String email;

    @NotNull(message = "phone doesn't take a null value")
    @Column(name = "phone")
    private String phone;

    @Column(unique = true, nullable = false)
    @NotNull(message = "username doesn't take a null value")
    private String username;

    @NotNull(message = "password doesn't take a null value")
    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_role")
    private Role role;

    public Role getRole ( ) {
        return role;
    }

    public void setRole ( Role role ) {
        this.role = role;
    }

    public Users() {}
    public Users ( String firstname , String lastname , String email , String phone , String username , String password ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public long getId ( ) {
        return id;
    }

    public String getFirstname ( ) {
        return firstname;
    }

    public String getLastname ( ) {
        return lastname;
    }

    public String getEmail ( ) {
        return email;
    }

    public String getPhone ( ) {
        return phone;
    }

    public String getUsername ( ) {
        return username;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setId ( long id ) {
        this.id = id;
    }

    public void setFirstname ( String firstname ) {
        this.firstname = firstname;
    }

    public void setLastname ( String lastname ) {
        this.lastname = lastname;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    @Override
    public String toString ( ) {
        return "Users{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
