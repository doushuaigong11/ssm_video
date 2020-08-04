package com.zz.pojo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Speaker {
    private Integer speakerId;

    private String speakerName;

    private String speakerJob;

    private String headImgUrl;

    private String speakerDesc;

}