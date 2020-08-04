package com.zz.service.impl;

import com.zz.dao.VideoMapper;
import com.zz.pojo.Video;
import com.zz.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAllVideo() {
        return videoMapper.findAllVideo();
    }

    @Override
    public int deleteById(Integer videoId) {
        return videoMapper.deleteByPrimaryKey(videoId);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        videoMapper.deleteByIds(ids);
    }

    @Override
    public int addVideo(Video video) {
        return videoMapper.insertSelective(video);
    }

    @Override
    public int updateVideo(Video video) {
        return videoMapper.updateByPrimaryKeySelective(video);
    }


}



