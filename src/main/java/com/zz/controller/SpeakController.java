package com.zz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.pojo.Speaker;
import com.zz.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("after/speaker")
public class SpeakController {
    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("findAllSpeaker")
    public List<Speaker> findAllSpeaker(){
        return speakerService.findAllSpeaker();
    }

    @RequestMapping("findAllSpeaker1")
    public Map findAllSpeaker(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Speaker> speakers = speakerService.findAllSpeaker();

        PageInfo<Speaker> pageInfo = new PageInfo<>(speakers);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("deleteById")
    public int deleteById(Integer id){
        return speakerService.deleteById(id);
    }

    @RequestMapping("deleteSpeakers")
    public String deleteByIds(Integer[] ids){
        speakerService.deleteByIds(ids);
        return "ok";
    }

    @RequestMapping("addSpeaker")
    public int addSpeaker(Speaker speaker){

        return speakerService.addSpeaker(speaker);
    }

    @RequestMapping("updateSpeaker")
    public int updateSpeaker(Speaker speaker){

        System.out.println(speaker);
        return speakerService.updateSpeaker(speaker);
    }


}
