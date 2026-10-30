package com.eazybytes.accounts.service.sevice.client;

import com.eazybytes.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

// all methods have to match exactly the rest endpoints method signature in Cards controller
// methods name can be anything, but path, return type and input params has ro match

@HttpExchange("/api")
public interface CardsClient {

    @GetExchange(value = "/fetch", accept = "application/json")
    ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber);
}
