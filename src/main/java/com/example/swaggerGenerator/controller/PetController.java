package com.example.swaggerGenerator.controller;

import io.swagger.client.ApiException;
import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetApi petApi;

    @GetMapping("/pets")
    public List<Pet> getPetByStatus() throws ApiException {
        return petApi.findPetsByStatus(List.of("available"));
    }
}
