package com.zz.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Course {
    private Integer id;

    private String courseTitle;

    private Integer subjectId;

    private String courseDesc;

}