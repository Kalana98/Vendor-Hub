package com.nexora.Controller;

import com.nexora.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler(){

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to 1st project of nexora labs");
        return apiResponse;
    }
}
