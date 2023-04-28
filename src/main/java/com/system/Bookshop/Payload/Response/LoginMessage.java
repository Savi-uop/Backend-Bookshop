package com.system.Bookshop.Payload.Response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginMessage {

    String message;
    Boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
