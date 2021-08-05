package com.ww.factory.method;

/**
 * @Description: 数据库形式日志记录器：具体产品
 * @author xiaohua
 * @date 2021年8月5日 下午4:34:32
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录中...");
    }

}
