package cn.zyj.page.controller;

import cn.zyj.page.response.SmsChannelResponse;
import cn.zyj.page.service.SmsChannelService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/SmsChannel")
public class SmsChannelController {

    @Autowired
    private SmsChannelService smsChannelService;

    @GetMapping("page")
    @CrossOrigin
    public PageInfo<SmsChannelResponse> selectByPage(int page,int limit,short providerId){
        PageInfo<SmsChannelResponse> list = smsChannelService.selectByPage(page,limit,providerId);
        return list;
    }
}
