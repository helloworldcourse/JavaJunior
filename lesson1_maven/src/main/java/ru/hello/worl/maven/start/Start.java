package ru.hello.worl.maven.start;

import com.google.common.collect.Maps;
import ru.hello.worl.maven.logic.DataNow;

import java.util.Map;

public class Start {

    public static void main(String[] args) {

        Map<String, String> guavaTest = Maps.newHashMap();

        guavaTest.put("Data now :", DataNow.getDate());

        for(Map.Entry<String, String> entry : guavaTest.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}
