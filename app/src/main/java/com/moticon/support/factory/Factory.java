package com.moticon.support.factory;

/**
 * This is a generic Factory Interface.  It will typecast objects for us at runtime when implemented
 * correctly.
 * @param DesiredInterface  - This is the Type or Interface that will be used.
 * @Param SuppliedData - This is the data that will be used to construct the object requested.
 */
public interface Factory <DesiredInterface, SuppliedDataClass>{

    <DesiredObject extends DesiredInterface> DesiredObject getItem(int type, SuppliedDataClass data);
}
