package com.example.lessontwocoursethree.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FirstController {
    @GetMapping
    public String appRun() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String info(@RequestParam String studentName, String projectName, String date, String description ) {
        return "Имя ученика: " + studentName +  ", название проекта: " + projectName + ", дата создания: " + date +
                ", описание: " + description ;
    }

}
