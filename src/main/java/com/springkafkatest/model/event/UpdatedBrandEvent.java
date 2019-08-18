package com.springkafkatest.model.event;

public class UpdatedBrandEvent {
    private String eventName;
    private String brandName;
    private String partner;

    public UpdatedBrandEvent(String eventName, String brandName, String partner) {
        this.eventName = eventName;
        this.brandName = brandName;
        this.partner = partner;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "UpdatedBrandDto{" +
                "eventName='" + eventName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", partner=" + partner +
                '}';
    }
}
