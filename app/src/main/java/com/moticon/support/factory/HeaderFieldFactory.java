package com.moticon.support.factory;

import com.moticon.UI.UIManager;
import com.moticon.network.Constants;
import com.moticon.network.headerField.HeaderField;
import com.moticon.network.headerField.LL2PAddressField;

public class HeaderFieldFactory implements Factory<HeaderField, String> {
    private static final HeaderFieldFactory thisFactory = new HeaderFieldFactory();

    private HeaderFieldFactory(){
        // nothing here.. :)
    }

    public static HeaderFieldFactory getInstance() {return thisFactory;}

    @Override
    public <headerFieldObject extends HeaderField> headerFieldObject getItem(int objectTypeID, String inputData)  {

        switch (objectTypeID) {
            case Constants.LL2P_DESTINATION_ADDRESS:
                UIManager.getInstance().displayMessage("Asking for LL2P Object");
                return (headerFieldObject) new LL2PAddressField(inputData, false);
            case Constants.LL2P_SOURCE_ADDRESS:
                UIManager.getInstance().displayMessage("Asking for source address");
                return (headerFieldObject) new LL2PAddressField(inputData, true);
            default:
                UIManager.getInstance().displayMessage("Default object creation");
                return (headerFieldObject) new LL2PAddressField(inputData, false);
        }
    }
}
