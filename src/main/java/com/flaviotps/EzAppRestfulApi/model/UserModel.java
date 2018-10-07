package com.flaviotps.EzAppRestfulApi.model;


import com.flaviotps.EzAppRestfulApi.Util.Enum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_USER")
public class UserModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Enum.UserAcess access = Enum.UserAcess.NORMAL;

    @Temporal(value = TemporalType.DATE)
    private Date joinDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private List<AppModel> apps = new ArrayList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppModel> getApps() {
        return apps;
    }

    public void setApps(List<AppModel> apps) {
        this.apps = apps;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Enum.UserAcess getAccess() {
        return access;
    }

    public void setAccess(Enum.UserAcess access) {
        this.access = access;
    }
}
