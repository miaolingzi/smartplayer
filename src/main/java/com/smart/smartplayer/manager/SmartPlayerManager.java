package com.smart.smartplayer.manager;

import android.content.Context;

import com.smart.smartplayer.SmartPlayer;

public class SmartPlayerManager {
    public static SmartPlayerManager videoPlayViewManage;
    private SmartPlayer videoPlayView;

    private SmartPlayerManager() {

    }

    public static SmartPlayerManager getSuperManage() {
        if (videoPlayViewManage == null) {
            videoPlayViewManage = new SmartPlayerManager();
        }
        return videoPlayViewManage;
    }

    public SmartPlayer initialize(Context context) {
        if (videoPlayView == null) {
            videoPlayView = new SmartPlayer(context);
        }
        return videoPlayView;
    }
}
