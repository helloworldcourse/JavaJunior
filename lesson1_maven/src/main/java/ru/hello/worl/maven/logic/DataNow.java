package ru.hello.worl.maven.logic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataNow {
    public static String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
