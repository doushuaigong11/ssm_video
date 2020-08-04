package com.zz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.pojo.Video;
import com.zz.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("after/video")
public class VideoController {

    @Autowired
    private VideoService videoService;
    @RequestMapping("findAllVideo")
    public Map findAllVideo(Integer page, Integer limit){

        PageHelper.startPage(page,limit);
        List<Video> videos = videoService.findAllVideo();

//        System.out.println(videos);
        PageInfo<Video> pageInfo = new PageInfo<>(videos);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("deleteById")
    public int deleteById(Integer id){

        System.out.println(id);
        return videoService.deleteById(id);
    }

    @RequestMapping("deleteByIds")
    public String deleteByIds(Integer[] ids){
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        videoService.deleteByIds(ids);
        return "ok";
    }

    @RequestMapping("addVideo")
    public int addVideo(Video video){
        System.out.println(video.toString());
        return videoService.addVideo(video);
    }

    @RequestMapping("updateVideo")
    public int updateVideo(Video video){

        System.out.println(video);

        return videoService.updateVideo(video);
    }

}
