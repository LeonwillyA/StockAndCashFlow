package com.controlbym.closestock;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Pruebi {

    @GetMapping("/hola")
    public String clacla(){
        return "Te saluda  tu DIOS ------ OMG";
    }
}
