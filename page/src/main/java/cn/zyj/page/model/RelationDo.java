package cn.zyj.page.model;

public class RelationDo {
    private Integer chanId;
    private short providerId;

    public Integer getChanId() {
        return chanId;
    }

    public void setChanId(Integer chanId) {
        this.chanId = chanId;
    }

    public short getProviderId() {
        return providerId;
    }

    public void setProviderId(short providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "RelationDo{" +
                "chanId=" + chanId +
                ", providerId=" + providerId +
                '}';
    }
}
