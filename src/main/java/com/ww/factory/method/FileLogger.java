package com.ww.factory.method;

/**
 * @Description: 文件日志记录器：具体产品
 * @author xiaohua
 * @date 2021年8月5日 下午4:35:25
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志记录中...");
    }

}
