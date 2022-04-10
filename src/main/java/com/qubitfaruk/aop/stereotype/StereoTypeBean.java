package com.qubitfaruk.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MyStereoType
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StereoTypeBean {
    private Long id ;
    private String name;
    private String trade;
}
