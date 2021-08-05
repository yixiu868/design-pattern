package com.ww.factory.method;

import org.junit.Test;

/**
 * @Description: 工厂方法测试程序
 * @author xiaohua
 * @date 2021年8月5日 下午4:39:32
 */
public class FactoryMethodTest {

    @Test
    public void test01() {
        LoggerFactory factory;
        Logger logger;
        
        // 文件日志记录器
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
        
        // 数据库日志记录器
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
