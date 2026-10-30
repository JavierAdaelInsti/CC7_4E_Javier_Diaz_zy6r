package com.example.zy6r_4E_Javier_Diaz_CC7.controller.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
@CrossOrigin("*")

@Getter
@Setter
public class PrestamoRequest {
    @NotNull(message = "")


}
