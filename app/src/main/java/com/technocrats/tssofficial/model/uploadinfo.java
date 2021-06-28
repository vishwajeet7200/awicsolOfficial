package com.technocrats.tssofficial.model;

public class uploadinfo {

    public String description;
    public String title;
    public String purl;

    public uploadinfo(String description, String title, String purl) {
        this.description = description;
        this.title = title;
        this.purl = purl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
