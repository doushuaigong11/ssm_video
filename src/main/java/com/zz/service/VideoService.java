package com.zz.service;

import com.zz.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAllVideo();

    int deleteById(Integer videoId);

    void deleteByIds(Integer[] ids);

    int addVideo(Video video);

    int updateVideo(Video video);
}
