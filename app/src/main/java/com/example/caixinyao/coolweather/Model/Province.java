package com.example.caixinyao.coolweather.Model;

/**
 * Created by CaiXinyao on 2016/8/25.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String name) {
        provinceName = name;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String code) {
        provinceCode = code;
    }
}
