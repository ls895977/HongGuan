package com.redchamber.event;

public class UpdateCityOnlineEvent {

    public String cityName;
    public String onlineFirst;
    public String provinceName;

    public UpdateCityOnlineEvent(String provinceName, String cityName, String onlineFirst) {
        this.cityName = cityName;
        this.onlineFirst = onlineFirst;
        this.provinceName = provinceName;
    }
}
