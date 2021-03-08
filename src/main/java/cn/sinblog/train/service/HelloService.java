package cn.sinblog.train.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class HelloService {
    private Integer nowTime;
    private String strTime;
    private String name;

    public Integer getNowTime() {
        return nowTime;
    }

    public void setNowTime(Integer nowTime) {
        this.nowTime = nowTime;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public HelloService(Integer nowTime, String strTime) {
//        this.nowTime = nowTime;
//        this.strTime = strTime;
//    }

    public HelloService(String name) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        this.strTime = df.format(date);
        this.nowTime = (int) date.getTime();
        this.name = String.format("Hello, %s!", name);
    }
}
