package com.kanoonth.ticketprovider.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by suwijakchaipipat on 4/4/2016 AD.
 */
public class Ticket extends RealmObject implements Serializable{

    @SerializedName("id") String id;
    @SerializedName("ticket_type_name") String ticketTypeName;
    @SerializedName("ticket_type_image_url") String ticketTypeImageUrl;
    @SerializedName("row") String row;
    @SerializedName("column") String column;
    @SerializedName("price") String price;
    @SerializedName("usage_quantity") String usageQuantity;
    @SerializedName("activity_name") String activityName;
    @SerializedName("activity_date") Date activityDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketTypeName() {
        return ticketTypeName;
    }

    public void setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
    }

    public String getTicketTypeImageUrl() {
        return ticketTypeImageUrl;
    }

    public void setTicketTypeImageUrl(String ticketTypeImageUrl) {
        this.ticketTypeImageUrl = ticketTypeImageUrl;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getUsageQuantity() {
        return usageQuantity;
    }

    public void setUsageQuantity(String usageQuantity) {
        this.usageQuantity = usageQuantity;
    }
}
