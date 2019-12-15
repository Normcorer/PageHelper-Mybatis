package cn.zyj.page.dao;

import cn.zyj.page.model.SmsChannelDO;
import cn.zyj.page.response.SmsChannelResponse;

import java.util.List;

public interface SmsChannelMapper {
    List<SmsChannelDO> selectByPage(short providerId);
}
