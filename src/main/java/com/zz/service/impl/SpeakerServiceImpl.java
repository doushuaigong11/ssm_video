package com.zz.service.impl;

import com.zz.dao.SpeakerMapper;
import com.zz.pojo.Speaker;
import com.zz.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public List<Speaker> findAllSpeaker() {
        return speakerMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    public int deleteById(Integer id) {
        return speakerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        System.out.println(ids);
        return speakerMapper.deleteByIds(ids);
    }

    @Override
    public int addSpeaker(Speaker speaker) {
        return speakerMapper.insertSelective(speaker);
    }

    @Override
    public int updateSpeaker(Speaker speaker) {
        return speakerMapper.updateSpeaker(speaker);
    }

}
