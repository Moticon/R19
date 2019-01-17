package com.moticon.support;

import android.app.Activity;

import com.moticon.UI.UIManager;
import com.moticon.network.Constants;

import java.util.Observable;

public class BootLoader extends Observable {
    private Activity parentActivity;

    public BootLoader(Activity activity){
        ParentActivity.setParentActivity(activity);
        parentActivity = activity;
        bootRouter();
    }

    /**
     *
     */
    private void bootRouter(){
        // boot router
        new Constants();
        addObserver(UIManager.getInstance());


        // all done, notify observers...
        setChanged();
        notifyObservers();

        // run tests..
        testBoot();
    }

    private void testBoot(){
        UIManager.getInstance().displayMessage("The router is up, IP Address is "+
                Constants.IP_ADDRESS);

    }
}
