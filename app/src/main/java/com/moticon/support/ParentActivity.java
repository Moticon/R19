package com.moticon.support;

import android.app.Activity;

public class ParentActivity {
    private static Activity parentActivity;

    public static void setParentActivity(Activity activity){
        parentActivity = activity;
    }

    public static Activity getParentActivity(){ return parentActivity;}
}
