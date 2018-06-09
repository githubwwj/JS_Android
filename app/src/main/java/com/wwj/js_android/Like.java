package com.wwj.js_android;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2018/6/9 0009.
 */

public class Like {

    @JavascriptInterface
    public void like(int likeCount, int userId) {
        Log.e("tag", "-----likeCount=" + likeCount + "------userId=" + userId);
    }

    @JavascriptInterface
    public void addResult(int result) {
        Log.e("tag", "-----a+b=" + result);
    }
}
