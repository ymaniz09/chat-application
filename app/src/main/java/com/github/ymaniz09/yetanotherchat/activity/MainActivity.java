package com.github.ymaniz09.yetanotherchat.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.github.ymaniz09.yetanotherchat.R;
import com.github.ymaniz09.yetanotherchat.adapter.MessageAdapter;
import com.github.ymaniz09.yetanotherchat.model.Message;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int mClientId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView messagesList = findViewById(R.id.list_view_messages);

        List<Message> messages = Arrays.asList(new Message(1, "hello world"),
                new Message(2, "hello!"));

        MessageAdapter adapter = new MessageAdapter(mClientId, messages, this);

        messagesList.setAdapter(adapter);
    }
}
