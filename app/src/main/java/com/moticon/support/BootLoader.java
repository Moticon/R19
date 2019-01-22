package com.moticon.support;

import android.app.Activity;

import com.moticon.UI.UIManager;
import com.moticon.network.Constants;
import com.moticon.network.headerField.LL2PAddressField;
import com.moticon.support.factory.HeaderFieldFactory;

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
        UIManager uiManager = UIManager.getInstance();

        //uiManager.displayMessage("Resulting String is " +
        //        Utilities.padHexString("ABC", 3));

        //HeaderFieldFactory headerFactory = HeaderFieldFactory.getInstance();

        //LL2PAddressField addressOne = headerFactory.getItem(Constants.LL2P_DESTINATION_ADDRESS, "001122");
        //LL2PAddressField addressTwo = headerFactory.getItem(Constants.LL2P_SOURCE_ADDRESS, "314159");
        //LL2PAddressField addressThree = headerFactory.getItem(Constants.LL2P_DESTINATION_ADDRESS, "DABDAB");

        //uiManager.displayMessage("The first Address Field: " + addressOne.explainSelf());
        //uiManager.displayMessage("The first Address Field: " + addressTwo.explainSelf());
        //uiManager.displayMessage("The first Address Field: " + addressThree.explainSelf());
    }
}
