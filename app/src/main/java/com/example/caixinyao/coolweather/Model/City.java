package com.example.caixinyao.coolweather.Model;

/**
 * Created by CaiXinyao on 2016/8/25.
 */
public class City {

    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String name) {
        cityName = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String code) {
        cityCode = code;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int id){
        provinceId = id;
    }
}
