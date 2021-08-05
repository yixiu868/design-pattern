package com.ww.factory.method;

/**
 * @Description: 数据库日志记录生产工厂：具体工厂
 * @author xiaohua
 * @date 2021年8月5日 下午4:37:16
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
