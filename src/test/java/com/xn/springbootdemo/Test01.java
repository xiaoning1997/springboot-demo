package com.xn.springbootdemo;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author XiaoNing
 * @date 2021/1/22
 */
public class Test01 {


    @Test
    public void t1() throws ParseException {

        System.out.println(LocalDateTime.now(ZoneId.of("Z")));
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateWorkDate = format.parse("2020-12-12");
        System.out.println(DateFormat.getDateTimeInstance().format(dateWorkDate));
        System.out.println("----");

        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 31, 12, 12, 12);
        Date dd = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dd);
        if (calendar.get(Calendar.DAY_OF_MONTH) != 1) {
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.MONTH, 1);
        }
        System.out.println(calendar.getTime());
    }

    @Test
    public void t2() {
        Date now = new Date();
        System.out.println(now);
        System.out.println(dateChange(now, 0, 0, 1, 0, 0, -1));
        System.out.println(dateChange(now, 0, 0, 0, 23, 59, 59));
        System.out.println(dateChange(now, 1, 0, 0, 0, 0, 0));


        Calendar calendar = Calendar.getInstance();

        System.out.println((String.valueOf(calendar.get(Calendar.MONTH) + 1)));
    }

    public static Date dateChange(Date date, int y, int M, int d, int h, int m, int s) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.YEAR, y);// 年增减
        rightNow.add(Calendar.MONTH, M);// 月增减
        rightNow.add(Calendar.DAY_OF_YEAR, d);// 日增减
        rightNow.add(Calendar.HOUR_OF_DAY, h);// 时增减
        rightNow.add(Calendar.MINUTE, m);// 分增减
        rightNow.add(Calendar.SECOND, s);// 秒增减
        return rightNow.getTime();
    }

    @Test
    public void t3() throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

        Date startDate;

        startDate = sim.parse("2020-01-01");


        long startMS = startDate.getTime();
        long endMS = startDate.getTime() + 1000 * 60 * 60 * 24;


        System.out.println(startMS);
        System.out.println(endMS);

        System.out.println(new Date(startMS));
        System.out.println(new Date(endMS));
    }

    @Test
    public void t4(){
        try{
            System.out.println(1);
            throw new IllegalArgumentException("exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(2);
        }
        System.out.println(3);
    }

    @Test
    public void t5(){
        Student stu1 = JSON.parseObject("{name:\"Dylan\",gender:\"Male\",classLevel:\"1. Freshman\",homeState:\"MA\",major:\"Math\",activity:\"Baseball\"}",Student.class);
        System.out.println(stu1);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student{
    private String name;
    private String gender;
    private String classLevel;
    private String homeState;
    private String major;
    private String activity;
}