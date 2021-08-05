package com.ww.chain;

/**
 * 总监
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name + ":" + request.getRequestContent() + "，数量" + request.getNumber() + ", 被批准");
        } else {
            if (null != superior) {
                superior.requestApplications(request);
            }
        }
    }
}
