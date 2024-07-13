package com.tinylinkapi.response;

import com.tinylinkapi.entity.LinkHub;

public class LinkHubResponse {
    private String message;
    private LinkHub linkHub;

    public LinkHubResponse(String message, LinkHub linkHub) {
        this.message = message;
        this.linkHub = linkHub;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LinkHub getLinkHub() {
        return linkHub;
    }

    public void setLinkHub(LinkHub linkHub) {
        this.linkHub = linkHub;
    }
}
