package com.notification.notify.entity;

public class Campain {
    private Long campaign_id;
    private String campaign_name;
    private String description;
    public Long getCampaign_id() {
        return campaign_id;
    }
    public void setCampaign_id(Long campaign_id) {
        this.campaign_id = campaign_id;
    }
    public String getCampaign_name() {
        return campaign_name;
    }
    public void setCampaign_name(String campaign_name) {
        this.campaign_name = campaign_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Campain(Long campaign_id, String campaign_name, String description) {
        this.campaign_id = campaign_id;
        this.campaign_name = campaign_name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Campain [campaign_id=" + campaign_id + ", campaign_name=" + campaign_name + ", description="
                + description + "]";
    }
    
}
