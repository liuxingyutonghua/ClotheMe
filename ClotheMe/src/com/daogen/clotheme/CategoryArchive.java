package com.daogen.clotheme;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table CategoryArchive.
 */
public class CategoryArchive {

    private long id;
    private Integer MeterialID;
    private Integer IsWashRemind;
    private String RemindTime;
    private String RemindFrequency;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public CategoryArchive() {
    }

    public CategoryArchive(long id) {
        this.id = id;
    }

    public CategoryArchive(long id, Integer MeterialID, Integer IsWashRemind, String RemindTime, String RemindFrequency) {
        this.id = id;
        this.MeterialID = MeterialID;
        this.IsWashRemind = IsWashRemind;
        this.RemindTime = RemindTime;
        this.RemindFrequency = RemindFrequency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getMeterialID() {
        return MeterialID;
    }

    public void setMeterialID(Integer MeterialID) {
        this.MeterialID = MeterialID;
    }

    public Integer getIsWashRemind() {
        return IsWashRemind;
    }

    public void setIsWashRemind(Integer IsWashRemind) {
        this.IsWashRemind = IsWashRemind;
    }

    public String getRemindTime() {
        return RemindTime;
    }

    public void setRemindTime(String RemindTime) {
        this.RemindTime = RemindTime;
    }

    public String getRemindFrequency() {
        return RemindFrequency;
    }

    public void setRemindFrequency(String RemindFrequency) {
        this.RemindFrequency = RemindFrequency;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}