package com.itheima.bean;

import com.itheima.run.MovieSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

// 电影信息类
public class Movie {
    private String name;        // 电影名字
    private String actor;       // 电影导演
    private double time;        // 电影时长
    private double price;       // 电影票价
    private int number;         // 电影余票
    private Date startTime;     // 放映时间

    public Movie() {
    }

    public Movie(String name, String actor, double time, double price, int number, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

//    public double getScore() {
//        List<Double> scores = MovieSystem.MOVIES_SCORE.get(name);
//        if(scores!=null && scores.size() > 0){
//            double sum = 0;
//            for (Double score : scores) {
//                sum += score;
//            }
//            return BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(scores.size()), 2 , RoundingMode.UP).doubleValue();
//        }else {
//            return 0;
//        }
//    }


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", time=" + time +
                ", price=" + price +
                ", number=" + number +
                ", startTime=" + startTime +
                '}';
    }
}
