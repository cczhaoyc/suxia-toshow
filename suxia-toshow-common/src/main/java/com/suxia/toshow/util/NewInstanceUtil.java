package com.suxia.toshow.util;

import java.lang.reflect.InvocationTargetException;

/**
 * @author cczhaoyc@163.com
 * @version v_1.0.0
 * @date Created in 2019年04月15 08:51 星期一
 * @description TODO 创建对象，必须有一个无参构造器
 */
public class NewInstanceUtil {

    public static <T> T create(Class<T> clazz, Class<?>... parameterTypes) throws InstantiationException,IllegalAccessException,InvocationTargetException{
        try {
            return clazz.getConstructor(parameterTypes).newInstance();
        } catch (final NoSuchMethodException e) {
            return clazz.newInstance();
        }
    }

    public static void main(String[] args) {

        try {
            Aoo aoo = NewInstanceUtil.create(Aoo.class);
            aoo.say();

            Boo boo = NewInstanceUtil.create(Boo.class);
            boo.say();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

class Aoo{

    public void say(){
        System.out.println("AOO");
    }
}

class Boo{
    public String hi;
    public Integer num;

    public Boo() {
    }

    public Boo(String hi) {
        this.hi = "0000";
    }

    public Boo(String hi, Integer num) {
        this.hi = hi;
        this.num = 888;
    }

    public void say(){
        System.out.println("BOO" + ":" + hi + ":" +num);
    }
}

