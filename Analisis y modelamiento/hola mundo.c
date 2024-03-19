//
// Created by yuulf on 14/2/2024.
//
#include <stdio.h>
#define PI 3.14159

// Función que recibe el radio de un círculo y devuelve su área
double area_circulo(double radio) {
    return PI * radio * radio;
}

int main() {
    double radio, area;
    printf("Ingrese el radio del círculo: ");
    scanf("%lf", &radio); // Lee el radio desde el teclado
    area = area_circulo(radio); // Llama a la función area_circulo
    printf("El área del círculo es: %.2f\n", area); // Muestra el área con dos decimales
    return 0;
}
