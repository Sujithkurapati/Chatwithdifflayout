package com.hello.practiseapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by Sujith on 13-05-2016.
 */
public class ViewHolderpractise extends RecyclerView.ViewHolder{

    public ViewHolderpractise(View v) {
        super(v);
    }

    public class SetHeader extends ViewHolderpractise{
        public TextView txt_header;
        public SetHeader(View viewHeader){
            super(viewHeader);
            this.txt_header = (TextView) viewHeader.findViewById(R.id.txt_header);
        }
    }

    public class SetImage extends ViewHolderpractise{
        TextView txt_retryDownload_image;
        public ImageView image;
        RelativeLayout imageContainer;
        public SetImage(View viewImage){
            super(viewImage);
            this.txt_retryDownload_image = (TextView) viewImage.findViewById(R.id.txt_retryDownload_image);
            this.image = (ImageView) viewImage.findViewById(R.id.image);
            this.imageContainer = (RelativeLayout) viewImage.findViewById(R.id.imageContainer);
        }
    }

    public class SetText extends ViewHolderpractise{
        public TextView adapter_txtmsg;
        LinearLayout contentWithBackground;
        public SetText(View viewText){
            super(viewText);
            this.adapter_txtmsg = (TextView) viewText.findViewById(R.id.adapter_txtmsg);
            this.contentWithBackground = (LinearLayout) viewText.findViewById(R.id.contentWithBackground);
        }
    }

    public class SetVideo extends ViewHolderpractise{
        public VideoView video;
        TextView txt_retryDownload_video;
        RelativeLayout videoContainer;
        public SetVideo(View viewVideo){
            super(viewVideo);
            this.txt_retryDownload_video = (TextView) viewVideo.findViewById(R.id.txt_retryDownload_video);
            this.video = (VideoView) viewVideo.findViewById(R.id.video);
            this.videoContainer = (RelativeLayout) viewVideo.findViewById(R.id.videoContainer);
        }
    }

    public void setAlignmentText(SetText holder, boolean isOutgoing) {
        //TODO- change isOutGoing to !isOutGoing if want to change left right orientation of chat
        if (isOutgoing) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.contentWithBackground.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
            holder.contentWithBackground.setLayoutParams(layoutParams);

            if (holder.adapter_txtmsg != null) {
                holder.contentWithBackground.setBackgroundResource(R.drawable.outgoing_message_bg);
            } else {
                holder.contentWithBackground.setBackgroundResource(android.R.color.transparent);
            }
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.contentWithBackground.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            holder.contentWithBackground.setLayoutParams(layoutParams);

            if (holder.adapter_txtmsg != null) {
                holder.contentWithBackground.setBackgroundResource(R.drawable.incoming_message_bg);
            } else {
                holder.contentWithBackground.setBackgroundResource(android.R.color.transparent);
            }
        }
    }

    public void setAlignmentImage(SetImage holder, boolean isOutgoing) {
        //TODO- change isOutGoing to !isOutGoing if want to change left right orientation of chat
        if (isOutgoing) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.imageContainer.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
            holder.imageContainer.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.imageContainer.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            holder.imageContainer.setLayoutParams(layoutParams);

        }
    }

    public void setAlignmentVideo(SetVideo holder, boolean isOutgoing) {
        //TODO- change isOutGoing to !isOutGoing if want to change left right orientation of chat
        if (isOutgoing) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.videoContainer.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
            holder.videoContainer.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.videoContainer.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            holder.videoContainer.setLayoutParams(layoutParams);

        }
    }

}
