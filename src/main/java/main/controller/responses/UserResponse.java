package main.controller.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponse {
    private String login;
    private String error;
    private boolean result;

    public UserResponse(boolean result) {
        this.result = result;
    }


    public UserResponse(String login, boolean result) {
        this.login = login;
        this.result = result;
    }
}
