package com.github.ymaniz09.yetanotherchat.model;

public class Message {

    private int mId;
    private String mMessageText;

    public Message(int id, String messageText) {
        this.mId = id;
        this.mMessageText = messageText;
    }

    public int getId() {
        return mId;
    }

    public String getMessageText() {
        return mMessageText;
    }
}
