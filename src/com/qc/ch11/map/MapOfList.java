package com.qc.ch11.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.map
 * @ClassName: MapOfList
 * @Author: android2
 * @Description:
 * @Date: 2019/10/18 上午8:37
 * @Version: 1.0
 */
public class MapOfList {
    public static Map<String , List<? extends MyPet>> map=new HashMap<>();
    static {
        map.put("pets", Arrays.asList(new Cat(),new Dog()));
        map.put("Dogpet", Arrays.asList(new Cat()));
    }

    public static void main(String[] args) {
        System.out.println("pets:"+map.keySet());
    }
}
