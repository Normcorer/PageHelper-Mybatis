package cn.zyj.page.service;

import cn.zyj.page.dao.SmsChannelMapper;
import cn.zyj.page.domian.SmsChannel;
import cn.zyj.page.model.SmsChannelDO;
import cn.zyj.page.response.SmsChannelResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SmsChannelService {
    @Autowired
    private SmsChannelMapper smsChannelMapper;
    public PageInfo<SmsChannelResponse> selectByPage(int page,int limit,short providerId) {
        Page<Object> page1 = PageHelper.startPage(page, limit);
        List<SmsChannelDO> smsChannelDOS = smsChannelMapper.selectByPage(providerId);
        System.out.println(smsChannelDOS);
        //对象互换
        List<SmsChannel> list = smsChannelDOS.stream().map(smsChannelDO -> {
            SmsChannel smsChannel = new SmsChannel();
            smsChannel.setChanId(smsChannelDO.getChanId());
            smsChannel.setChanName(smsChannelDO.getChanName());
            smsChannel.setGroupId(smsChannelDO.getGroupId());
            smsChannel.setCreateBy(smsChannelDO.getCreateBy());
            return  smsChannel;
        }).collect(Collectors.toList());
        List<SmsChannelResponse> responses = list.stream().map(smsChannel -> {
           SmsChannelResponse smsChannelResponse = new SmsChannelResponse();
           smsChannelResponse.setChanId(smsChannel.getChanId());
           smsChannelResponse.setChanName(smsChannel.getChanName());
           smsChannelResponse.setGroupId(smsChannel.getGroupId());
           smsChannelResponse.setCreateBy(smsChannel.getCreateBy());
           return smsChannelResponse;
       }).collect(Collectors.toList());
        //注意new PageInfo()中一定要是startPage之后的对象，否则total会等于pageSize
        PageInfo<SmsChannelResponse> pageInfo = new PageInfo(smsChannelDOS);
        System.out.println( pageInfo.getTotal());
        return pageInfo;
    }
}
