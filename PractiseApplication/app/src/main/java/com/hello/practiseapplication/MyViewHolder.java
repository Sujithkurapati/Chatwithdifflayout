//package com.hello.practiseapplication;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.Gravity;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ProgressBar;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.VideoView;
//
///**
// * Created by Sujith on 12-05-2016.
// */
//public class MyViewHolder extends RecyclerView.ViewHolder {
//
//    public TextView adapter_text_msg, txt_retryDownload_video, txt_retryDownload_image;
//    public ProgressBar progressBar_image, progressBar_video;
//    public RelativeLayout imageContainer, videoContainer;
//    public LinearLayout contentWithBackground;
//    public ImageView image;
//    public VideoView video;
//
//
//    public MyViewHolder(View view) {
//        super(view);
//
//        adapter_text_msg = (TextView) view.findViewById(R.id.adapter_text_msg);
//        txt_retryDownload_image = (TextView) view.findViewById(R.id.txt_retryDownload_image);
//        txt_retryDownload_video = (TextView) view.findViewById(R.id.txt_retryDownload_video);
//
//        progressBar_image = (ProgressBar) view.findViewById(R.id.progressBar_image);
//        progressBar_video = (ProgressBar) view.findViewById(R.id.progressBar_video);
//
//        imageContainer = (RelativeLayout) view.findViewById(R.id.imageContainer);
//        videoContainer = (RelativeLayout) view.findViewById(R.id.videoContainer);
//
//        contentWithBackground = (LinearLayout) view.findViewById(R.id.contentWithBackground);
//
//        image = (ImageView) view.findViewById(R.id.image);
//
//        video = (VideoView) view.findViewById(R.id.video);
//    }
//
//    public void setAlignment(MyViewHolder holder, boolean isOutgoing, int val) {
//        //TODO- change isOutGoing to !isOutGoing if want to change left right orientation of chat
//        if (isOutgoing) {
//            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.contentWithBackground.getLayoutParams();
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
//            holder.contentWithBackground.setLayoutParams(layoutParams);
//
//
//            LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) holder.adapter_text_msg.getLayoutParams();
//            layoutParams1.gravity = Gravity.RIGHT;
//            if (holder.adapter_text_msg != null) {
//                holder.contentWithBackground.setBackgroundResource(R.drawable.outgoing_message_bg);
//                layoutParams1 = (LinearLayout.LayoutParams) holder.adapter_text_msg.getLayoutParams();
//                layoutParams1.gravity = Gravity.RIGHT;
//                holder.adapter_text_msg.setLayoutParams(layoutParams1);
//            } else {
//                holder.contentWithBackground.setBackgroundResource(android.R.color.transparent);
//            }
//        } else {
//            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.contentWithBackground.getLayoutParams();
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
//            holder.contentWithBackground.setLayoutParams(layoutParams);
//
//            LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) holder.adapter_text_msg.getLayoutParams();
//            layoutParams1.gravity = Gravity.LEFT;
//            if (holder.adapter_text_msg != null) {
//                holder.contentWithBackground.setBackgroundResource(R.drawable.incoming_message_bg);
//                layoutParams1 = (LinearLayout.LayoutParams) holder.adapter_text_msg.getLayoutParams();
//                layoutParams1.gravity = Gravity.LEFT;
//                holder.adapter_text_msg.setLayoutParams(layoutParams1);
//            } else {
//                holder.contentWithBackground.setBackgroundResource(android.R.color.transparent);
//            }
//        }
//    }
//}
