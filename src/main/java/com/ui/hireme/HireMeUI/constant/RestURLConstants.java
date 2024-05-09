package com.ui.hireme.HireMeUI.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RestURLConstants {

    /*public static final String NEW_USER_ENDPOINT_URL = "http://localhost:9091/HireMe/newUser";
    public static final String Login_User_validation = "http://localhost:9091/HireMe/loginUser";*/

   @Value("${endpoint.url.new_user}")
    public String NEW_USER_ENDPOINT_URL;

    @Value("${endpoint.url.login_user_validation}")
    public String Login_User_validation;
}
