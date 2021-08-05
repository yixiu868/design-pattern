package com.ww.factory.method;

/**
 * @Description: 文件日志生产工厂：具体工厂
 * @author xiaohua
 * @date 2021年8月5日 下午4:38:32
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

}
