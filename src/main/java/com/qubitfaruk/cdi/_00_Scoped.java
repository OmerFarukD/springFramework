package com.qubitfaruk.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "scoptuto")
//@ApplicationScoped //bütün uygulama boyunca çalışır.
//@RequestScoped //bir istek boyunca çalışır.
@SessionScoped //bir kullanıcı için çalışır. Logout olduğu zaman biter. implements Serializable eklenmelidir.
//@Dependent //çağrılan sınıfın scope türünü alır bukalemun gibi.
//@ConversationScoped //belli istek boyunca çalışır.

public class _00_Scoped implements Serializable {


}
