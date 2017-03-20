package com.example.eventbus.eventbus;

/**
 * Created by $tangj$
 * Time at: 2017/3/15 21:34
 */

public class MessageEvent {
    private String mMsg;
    public MessageEvent(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
