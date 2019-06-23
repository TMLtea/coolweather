package com.azure.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;

    private  String cityName; // 记录城市名

    private int cityCode; // 记录市的代号

    private int provinceId; // 当前市所属省的ID值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}