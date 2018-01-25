package org.sky.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.beanutils.PropertyUtils;
import com.sky.common.DTO.UserDTO;
import com.sky.common.utils.MD5Util;
import com.sky.common.utils.UUIDUtil;
import com.sky.dao.DO.UserDO;

import com.alibaba.fastjson.JSON;

public class TestJava {

    public static void main(String[] args) {
//        Runnable r = () -> {
//            System.out.println("RunningfromLambda");
//        };
//        r.run();
//        
//        new Thread(() -> { System.out.println("hi."); }).start();
//        
//        List<String> list = Arrays.asList("e", "a", "b", "c", "d");
//
//        list.forEach(n -> System.out.println(n));
//        
//        list.forEach(System.out::println);
//        
//        Stream<String> s = list.stream();
//        
//        IntStream.range(1, 6).forEach(System.out::println);
//        
//        Stream.of(
//                Arrays.asList(1),
//                Arrays.asList(1,2)
//        );
//        
//        List<?> list1 = Arrays.asList(200,100,400,300);
//        Stream<?> st = list.stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo));
//        System.out.println(JSON.toJSONString(st.toArray()));
        UserDO u = new UserDO();
        u.setId(UUIDUtil.getID());
        u.setNickname("春阳冬雪");
        u.setAccount("cydx");
        u.setPassword(MD5Util.md5("666666"));
        u.setCreatetime(new Date());
        try {
            UserDTO new_u = new UserDTO();
            PropertyUtils.copyProperties(new_u, u);
            System.out.println(JSON.toJSONString(new_u));
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    
    <T> void copy(T oldT, T newT) {
        Method[] methods = oldT.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            String name = methods[i].getName();
        }
        
    }
    
    
    

}
