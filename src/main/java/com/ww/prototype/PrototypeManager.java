package com.ww.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    // 用来记录原型的编号和原型实例的对应关系
    private static Map<String, Prototype> map = new HashMap<>();

    // 私有化构造方法，避免外部创建实例
    private PrototypeManager() {}


    /**
     * 向原型管理器里添加或修改某个原型注册
     * @param prototypeId
     * @param prototype
     */
    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 从原型管理器里边删除某个原型注册
     * @param prototypeId
     */
    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 获取某个原型编号对应的原型实例
     * @param prototypeId
     * @return
     * @throws Exception
     */
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if (null == prototype) {
            throw new Exception("你希望获取的原型还没有注册或已被销毁");
        }

        return prototype;
    }
}
