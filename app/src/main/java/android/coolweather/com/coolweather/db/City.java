package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by guoran on 2017/11/5.
 */

public class City extends DataSupport{

    private int id;

    private String cityName;

    private int provinceID;

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

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
