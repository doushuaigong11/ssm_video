package com.zz.service;

import com.zz.pojo.Speaker;

import java.util.List;

public interface SpeakerService {

    List<Speaker> findAllSpeaker();

    int deleteById(Integer id);

    int deleteByIds(Integer[] ids);

    int addSpeaker(Speaker speaker);

    int updateSpeaker(Speaker speaker);
}
