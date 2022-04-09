package com.qubitfaruk.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {

    public List<String> getTuketen() {
        return tuketen;
    }

    List<String> tuketen;
}
