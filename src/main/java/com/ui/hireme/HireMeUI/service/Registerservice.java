package com.ui.hireme.HireMeUI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ui.hireme.HireMeUI.constant.RestURLConstants;
import com.ui.hireme.HireMeUI.model.LoginEntity;
import com.ui.hireme.HireMeUI.model.RegisterModel;
import com.ui.hireme.HireMeUI.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class Registerservice {

    private final RestURLConstants restURLConstants;
    @Autowired
    public Registerservice(RestURLConstants restURLConstants, RestTemplate restTemplate) {
        this.restURLConstants = restURLConstants;
        this.restTemplate = restTemplate;
    }

    private final RestTemplate restTemplate;
    /*public Registerservice(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }*/

    public Response registerUser(RegisterModel registerModel) {
        Response response = restTemplate.postForObject(restURLConstants.NEW_USER_ENDPOINT_URL, registerModel, Response.class);
        return response;
    }
    public Response loginUser(LoginEntity login) {
        Response response = restTemplate.postForObject(restURLConstants.Login_User_validation, login, Response.class);

        return response;
    }

}


