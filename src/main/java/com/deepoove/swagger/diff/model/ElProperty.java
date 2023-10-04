package com.deepoove.swagger.diff.model;

import io.swagger.models.properties.Property;

/**
 * property with expression Language grammar
 * 
 * @author Sayi
 * @version
 */
public class ElProperty {

    private String el;

    private Property property;

    // optional change metadata
    private boolean isTypeChange;
    private boolean isRequiredChange;
    private boolean newEnums;
    private boolean removedEnums;
    private Property leftProperty;
    private Property rightProperty;



    public Property getLeftProperty() {
        return leftProperty;
    }

    public Property getRightProperty() {
        return rightProperty;
    }

    public void setLeftProperty(Property leftProperty) {
        this.leftProperty = leftProperty;
    }

    public void setRightProperty(Property rightProperty) {
        this.rightProperty = rightProperty;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public boolean isTypeChange() {
        return isTypeChange;
    }

    public void setTypeChange(boolean typeChange) {
        isTypeChange = typeChange;
    }

    public boolean isNewEnums() {
        return newEnums;
    }

    public void setNewEnums(boolean newEnums) {
        this.newEnums = newEnums;
    }

    public boolean isRemovedEnums() {
        return removedEnums;
    }

    public void setRemovedEnums(boolean removedEnums) {
        this.removedEnums = removedEnums;
    }

    public boolean isRequiredChange() {
        return isRequiredChange;
    }

    public void setRequiredChange(boolean requiredChange) {
        isRequiredChange = requiredChange;
    }
}
