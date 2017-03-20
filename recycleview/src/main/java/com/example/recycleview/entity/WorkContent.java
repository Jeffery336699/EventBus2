package com.example.recycleview.entity;

/**
 * Created by $tangj$
 * Time at: 2017/3/18 22:15
 */

public class WorkContent {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WorkContent(String content) {
        this.content = content;
    }

    public WorkContent() {
    }

    @Override
    public String toString() {
        return "WorkContent{" +
                "content='" + content + '\'' +
                '}';
    }
}
