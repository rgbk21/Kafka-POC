package com.example.demo;

public class Message {

    private String id;
    private String nameOfSender;
    private String msg;

    public Message(String id, String nameOfSender, String msg) {
        this.id = id;
        this.nameOfSender = nameOfSender;
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfSender() {
        return nameOfSender;
    }

    public void setNameOfSender(String nameOfSender) {
        this.nameOfSender = nameOfSender;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("nameOfSender", nameOfSender)
                .add("msg", msg)
                .toString();
    }
}
