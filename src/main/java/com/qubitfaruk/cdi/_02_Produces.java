package com.qubitfaruk.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
@Named(value = "producetuto")
@ApplicationScoped

public class _02_Produces {
    @Produces //bu anotasyon üretmeyi sağlar.
    public List<String> getList(){
        List<String> liste=new ArrayList<>();
        liste.add("html5");
        liste.add("css");
        liste.add("react");
        liste.add("Angular");
        return liste;
    }
}
