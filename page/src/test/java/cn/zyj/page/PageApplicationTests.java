//package cn.zyj.page;
//
//import cn.zyj.page.Util.ProviderEnum;
//import cn.zyj.page.dao.SmsChannelMapper;
//import cn.zyj.page.domian.SmsChannel;
//import cn.zyj.page.model.SmsChannelDO;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//class PageApplicationTests {
//    @Autowired
//    private SmsChannelMapper smsChannelMapper;
//    @Test
//    public void test(){
//        PageHelper.startPage(1,10);
//        List<SmsChannelDO> smsChannelDOS = smsChannelMapper.selectByPage();
//        PageInfo<SmsChannelDO> pageInfo = new PageInfo<>(smsChannelDOS);
//        System.out.println(pageInfo.getTotal());
//        System.out.println(pageInfo);
//
//
//    }
//    @Test
//    public void test1(){
//        System.out.println(ProviderEnum.getDesctiptionByValue(1));
//    }
//
//}
