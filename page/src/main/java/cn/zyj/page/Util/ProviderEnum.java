package cn.zyj.page.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum ProviderEnum {
    ZGYD(1,"中国移动"),
    ZGLT(2,"中国联通"),
    ZGDX(3,"中国电信");

    private int value;
    private String description;
    ProviderEnum(int value,String description){
        this.value=value;
        this.description=description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getDesctiptionByValue(int value){
        List<ProviderEnum> list =new ArrayList<>();
        list.add(ProviderEnum.ZGYD);
        list.add(ProviderEnum.ZGLT);
        list.add(ProviderEnum.ZGDX);
        String s = list.stream().filter(ProviderEnum -> ProviderEnum.getValue()==value).map(ProviderEnum::getDescription).collect(Collectors.toList()).toString();
        return s;
    }
}
