package com.CalculadoraRest.Services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    // Método suma
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Método resta
    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    // Método multiplicación
    public double multiplica(double num1, double num2) {
        return num1 * num2;
    }

    // Método división
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
