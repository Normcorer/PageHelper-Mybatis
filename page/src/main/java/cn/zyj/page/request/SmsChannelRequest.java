package cn.zyj.page.request;

public class SmsChannelRequest {
    private Integer chanId;

    private String chanName;

    private Integer groupId;

    private String createBy;

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

    @Override
    public String toString() {
        return "SmsChannel{" +
                "chanId=" + chanId +
                ", chanName='" + chanName + '\'' +
                ", groupId=" + groupId +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}
