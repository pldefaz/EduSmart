package com.edusmart.edusmart.controller;

import com.edusmart.edusmart.service.EduSmartAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    @Autowired
    private EduSmartAIService eduSmartAIService;

    @GetMapping("/publicidad")
    public String obtenerPublicidad(
            @RequestParam String tema,
            @RequestParam String audiencia) {

        return eduSmartAIService.generarPublicidad(tema, audiencia);
    }
}