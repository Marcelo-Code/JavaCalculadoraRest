package com.CalculadoraRest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CalculadoraRest.Services.CalculadoraService;
import com.CalculadoraRest.utils.ApiResponse;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/suma")
    public ResponseEntity<?> suma(@RequestParam double num1, @RequestParam double num2) {
        try {
            ApiResponse apiResponse = new ApiResponse("ok", this.calculadoraService.suma(num1, num2));
            return ResponseEntity.ok().body(apiResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error: ", e.getMessage()));
        }
    }

    @GetMapping("/resta")
    public ResponseEntity<?> resta(@RequestParam double num1, @RequestParam double num2) {
        try {
            ApiResponse apiResponse = new ApiResponse("ok", this.calculadoraService.resta(num1, num2));
            return ResponseEntity.ok().body(apiResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error: ", e.getMessage()));
        }
    }

    @GetMapping("/multiplicacion")
    public ResponseEntity<?> multiplicacion(@RequestParam double num1, @RequestParam double num2) {
        try {
            ApiResponse apiResponse = new ApiResponse("ok", this.calculadoraService.multiplica(num1, num2));
            return ResponseEntity.ok().body(apiResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error: ", e.getMessage()));
        }
    }

    @GetMapping("/division")

    // ResponseEntity es una clase en Spring que representa una respuesta HTTP
    // completa,
    // es la manera de responder desde el servidor y poder devolver un JSON
    // con el estado de la operación por ejemplo (si está ok, da código 200)
    public ResponseEntity<?> division(@RequestParam double num1, @RequestParam double num2) {
        try {
            ApiResponse apiResponse = new ApiResponse("ok", this.calculadoraService.divide(num1, num2));
            return ResponseEntity.ok().body(apiResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error: ", e.getMessage()));
        }
    }

}
