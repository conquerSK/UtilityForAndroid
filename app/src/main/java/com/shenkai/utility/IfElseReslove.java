package com.shenkai.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shenkai on 2019/4/30.
 * Describe:
 */
public class IfElseReslove {
    public static abstract class Event<T, R> {
        /**
         * 泛型T，和R是传入的参数和返回值类型
         * @param inParams
         * @return
         */
        public abstract R event(T inParams);

        public R execute(T inParams) {
            return event(inParams);
        }
    }

    public static void main(String[] args) {
        Map<String, Event<Object, Object>> eventMap = new HashMap<>();
        //初始化各种类型并添加进去
        eventMap.put("type", new Event<Object, Object>() {
            @Override
            public Object event(Object inParams) {
                //不同类型对应不同的事件
                return null;
            }
        });

        //使用的时候
        Event<Object, Object> event = eventMap.get("type");
        event.execute(null);
    }
}
