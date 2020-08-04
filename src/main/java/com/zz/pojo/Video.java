package com.zz.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Video {
    private Integer id;

    private String title;

    private Integer time;

    private Integer speakerId;

    private Integer courseId;

    private String videoUrl;

    private String imageUrl;

    private Integer playNum;

    private String detail;

    private String speakerName;

    private String courseTitle;


}