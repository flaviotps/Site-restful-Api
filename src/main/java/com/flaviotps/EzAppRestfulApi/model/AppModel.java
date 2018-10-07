package com.flaviotps.EzAppRestfulApi.model;


import com.flaviotps.EzAppRestfulApi.Util.Enum;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "TB_APP")
public class AppModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Enum.AppState appState = Enum.AppState.ACTIVE;

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

    public Enum.AppState getAppState() {
        return appState;
    }

    public void setAppState(Enum.AppState appState) {
        this.appState = appState;
    }
}
