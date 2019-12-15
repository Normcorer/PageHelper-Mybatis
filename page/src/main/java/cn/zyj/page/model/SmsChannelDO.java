package cn.zyj.page.model;

import cn.zyj.page.Util.ProviderEnum;
import javafx.scene.control.ProgressBar;

import java.util.List;
import java.util.stream.Collectors;

public class SmsChannelDO {
    private Integer chanId;

    private String chanName;

    private Integer groupId;

    private String createBy;

    private List<RelationDo> relationDo;

    private String providers;

    public List<RelationDo> getRelationDo() {

        return relationDo;
    }

    public void setRelationDo(List<RelationDo> relationDo) {
        this.relationDo = relationDo;
    }

    public Integer getChanId() {
        return chanId;
    }

    public void setChanId(Integer chanId) {
        this.chanId = chanId;
    }

    public String getChanName() {
        return chanName;
    }

    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public  String getProviders() {
        //return this.relationDo.stream().map(relationDo1 -> ProviderEnum.getDesctiptionByValue(relationDo1.getProviderId())).collect(Collectors.toList()).toString();
       // return getRelationDo().stream().map(x -> ProviderEnum.getDesctiptionByValue(x.getProviderId())).collect(Collectors.toList()).toString();
        System.out.println("--------------------------1");
        System.out.println(relationDo);
        System.out.println("--------------------------2");
        System.out.println("**************************3");
        System.out.println(relationDo.stream().map(x -> ProviderEnum.getDesctiptionByValue(x.getProviderId())).collect(Collectors.toList()).toString());
        System.out.println("**************************4");
        return relationDo.stream().map(x -> ProviderEnum.getDesctiptionByValue(x.getProviderId())).collect(Collectors.toList()).toString();
    }
    @Override
    public String toString() {
        return "SmsChannelDO{" +
                "chanId=" + chanId +
                ", chanName='" + chanName + '\'' +
                ", groupId=" + groupId +
                ", createBy='" + createBy + '\'' +
                ", relationDo=" + relationDo +
                ", providers='" + providers + '\'' +
                '}';
    }
}
