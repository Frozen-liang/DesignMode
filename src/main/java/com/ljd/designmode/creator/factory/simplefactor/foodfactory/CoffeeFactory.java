package com.ljd.designmode.creator.factory.simplefactor.foodfactory;

import com.ljd.designmode.creator.factory.simplefactor.food.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 15:20
 * @Version 1.0
 */
public class CoffeeFactory {
    // 根据配置类 获取咖啡对象存储
    // 1 定义容器存储
    private static final Map<String, Coffee> map = new HashMap<>();

    // 2 加载配置文件 只加载一次
    static {
        // 创建对象
        Properties properties = new Properties();
        // 获取类路径
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("simplefactor.properties");
        try {
            // 加载配置文件对象
            properties.load(inputStream);
            // 获取对象
            Set<Object> key = properties.keySet();
            // o = Property(className)
            for (Object o : key) {
                // 获取全类名
                String className = properties.getProperty((String) o);
                // 反射创建获取类名的对象
                // 1 获取字节码对象
                Class<?> aClass = Class.forName(className);
                // 2 用无参构造方法创建对象
                Coffee coffee = (Coffee) aClass.newInstance();
                // 3 存储到容器
                map.put((String) o, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Coffee creatCoffee(String name) {
        return map.get(name);
    }
}
