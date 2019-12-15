package cn.zyj.page.domian;

public class SmsChannel {
    private Integer chanId;

    private String chanName;

    private Integer groupId;

    private String createBy;

    private String providers;

    public String getProviders() {
        return providers.substring(1,providers.length()-1);
    }

    public void setProviders(String providers) {
        this.providers = providers;
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
