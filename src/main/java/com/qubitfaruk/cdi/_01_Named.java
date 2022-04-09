package com.qubitfaruk.cdi;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Named(value = "named")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String data;

}
