package com.example.caixinyao.coolweather.Model;

/**
 * Created by CaiXinyao on 2016/8/25.
 */
public class Country {
    private int id;
    private String countryName;
    private String countryCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String name) {
        countryName = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String code) {
        countryCode = code;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int id ) {
        cityId = id;
    }
}
