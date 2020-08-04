package com.zz.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Subject {
    private Integer id;

    private String subjectName;
}