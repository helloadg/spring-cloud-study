package com.helloworld2050.study.kafka;

public class Message {
    private Integer id;
    private String content;

    public Message(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Message() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
