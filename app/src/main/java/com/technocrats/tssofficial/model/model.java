package com.technocrats.tssofficial.model;

public class model {
    String title,description,purl;
    model()
    {

    }

    public model(String title, String description, String purl) {
        this.title = title;
        this.description = description;
        this.purl = purl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
