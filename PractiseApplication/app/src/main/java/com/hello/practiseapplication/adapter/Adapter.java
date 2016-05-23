package com.hello.practiseapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hello.practiseapplication.R;
import com.hello.practiseapplication.ViewHolderpractise;

/**
 * Created by Sujith on 13-05-2016.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolderpractise> {

    @Override
    public ViewHolderpractise onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if (viewType == 1) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_image, parent, false);
            ViewHolderpractise.SetImage image = new ViewHolderpractise(v).new SetImage(v);
            return image;
        } else if(viewType == 0) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_text, parent, false);
            ViewHolderpractise.SetText text = new ViewHolderpractise(v).new SetText(v);
            return text;
        }else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_viewtitle, parent, false);
            ViewHolderpractise.SetHeader header = new ViewHolderpractise(v).new SetHeader(v);
            return header;
        }

    }

    @Override
    public void onBindViewHolder(ViewHolderpractise holder, int position) {
        if (holder.getItemViewType() == 0) {
            ViewHolderpractise.SetText holdercommon = (ViewHolderpractise.SetText) holder;
            holdercommon.adapter_txtmsg.setText("postion of the elemetn " + position);

            if (position % 2 == 0)
                holdercommon.setAlignmentText(holdercommon, true);
            else
                holdercommon.setAlignmentText(holdercommon, false);

        } else  if (holder.getItemViewType() == 1){
            ViewHolderpractise.SetImage holdercommon = (ViewHolderpractise.SetImage) holder;
            holdercommon.image.setImageResource(R.mipmap.ic_launcher);

            if (position % 2 == 0)
                holder.setAlignmentImage(holdercommon, true);
            else
                holder.setAlignmentImage(holdercommon, false);
        }else {
            ViewHolderpractise.SetHeader holdercommon = (ViewHolderpractise.SetHeader) holder;
            holdercommon.txt_header.setText("Today");
        }


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 3 || position == 6) {
            return 1;
        } else if(position==0){
            return 2;
        }else
            return 0;
    }
}
