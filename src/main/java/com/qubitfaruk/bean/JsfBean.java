package com.qubitfaruk.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String mesaj;

    public JsfBean() {
        this.mesaj = "bu benim ilk örneğim.";
    }
}
