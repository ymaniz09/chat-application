package com.github.ymaniz09.yetanotherchat.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.github.ymaniz09.yetanotherchat.R;
import com.github.ymaniz09.yetanotherchat.model.Message;

import java.util.List;

public class MessageAdapter extends BaseAdapter {

    private List<Message> mMessagesList;
    private Activity mActivity;
    private int mClientId;

    public MessageAdapter(int clientId, List<Message> messages, Activity activity) {
        this.mMessagesList = messages;
        this.mActivity = activity;
        this.mClientId = clientId;
    }

    @Override
    public int getCount() {
        return mMessagesList.size();
    }

    @Override
    public Message getItem(int position) {
        return mMessagesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = mActivity.getLayoutInflater().inflate(R.layout.message_item, parent, false);

        TextView text = row.findViewById(R.id.message_text);

        Message message = getItem(position);

        if (mClientId != message.getId()) {
            row.setBackgroundColor(Color.CYAN);
        }

        text.setText(message.getMessageText());

        return row;
    }
}
