/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.acs.caluladora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName; //Declarar nombres personalizados de caso de prueba
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest; //Denota que un método es una prueba parametrizada
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Emmanuel Vite
 */
@TestMethodOrder(OrderAnnotation.class)
@DisplayName ("Casos de prueba. Clase Calculator Test")
public class CalculatorTest {
    /**
     * Variables globales para relizar pruebas con los métodos de la clase Calculator
    **/
    int a, b;
    /**
    *   Objeto de la clase calculator para realizar pruebas
    */
    Calculator instance;

    /**
    * Nota: Ruta absoluta para para realizar pruebas, en caso de que no se importen 
    * Formato general de un método de prueba
    */
    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }
    
    /**
    * Ejemplo 1.
    * Un método cualquiera de prueba. 
    */
    @Test
    @DisplayName("Ejemplo 1: Caso de prueba addsTwoNumbers")
    void addsTwoNumbers() {
	Calculator calculator = new Calculator();
	assertNotEquals(0, calculator.add(1, 1));
    }
 
    /**
     * Ejemplo 2.
     * Motrando en funcionamiento de las aseveraciones.
     */
    @Test
    @DisplayName("Ejemplo 2: Caso de prueba generica")
    void prueba(){
        assertNotEquals(2, instance.add(1, 10));
    }
 
    /**
     * Ejemplo: 3.
     */
    @Test
    @Order(1)
    @DisplayName("Ejemplo 3: Caso de prueba con orden")
    public void testAdd() {
        System.out.println("Prueba para testAdd");
        int c = 0, d = 1, expResult = 1, result; 
        result = instance.add(c, d);
        assertEquals(expResult, result);
    }

  
    /**
         *Ejemplo 4.
     */
    @Test
    @Order(2)
    public void testRestar() {
        System.out.println("Prueba para restar");
        int result = instance.restar(-4, 4);
        int expResult = -8; 
        assertEquals(expResult, result);
    }

    /**
     * Ejemplo 5.
     */
    @Test
    @Order(3)
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int expResult = 1;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Ejemplo 6.
     * Muestra como trabajar con excepciones
     */
    @Test
    @Order(4)
    public void testDivision() {
        System.out.println("Prueba para la division");
       
        int c = 2, d = 0;
        /*
        int expResult = 0;
        int result = instance.division(c, d);
        assertEquals(expResult, result);
        */
        Exception e = assertThrows(ArithmeticException.class, 
                () -> instance.division(c, d));
        assertEquals("División por cero", e.getMessage());
    }
    /**
    * Ejemplo 7.
    * Ejemplo ejecución varias pruebas la vez
    */
    
    @Test
    //@Order(5)
    @DisplayName("Ejemplo 7")
    @Disabled ("Hasta que se corrija el error, en el método suma. ")
    void testSuma(){
        instance = new Calculator();  // Al Fallar la primera prueba no veo la segunda...
        assertEquals(2, instance.add(1, 1),"Suma dos números positivos correctamente" );
        System.out.println("Prueba 1");
        assertNotEquals(100, instance.add(-1, 1),"Suma un mumero negativo y positivo correctamente" );
        System.out.println("Prueba 2");
        assertNotNull(instance,"EL objeto debe ser instanciado");
        System.out.println("Prueba 3");
    }
    /**
     * Ejemplo 8.
     * Ejecución de varias pruebas a la vez
     */
    @Test
    void testSumaAll(){
        System.out.println("Pruebas Assert All");
        assertAll(
                () -> assertEquals(2, instance.add(1, 1),"no suma dos números positivos correctamente" ),
                () -> assertNotEquals(100, instance.add(-1, 1),"no suma un mumero negativo y psitivo correctamente" ),
                () -> assertNotNull(instance,"EL objeto debe ser instanciado")
                );
    }
    
    /**
     * Ejemplo 9.
     * Pruebas repetidas
     */
    //@Disabled
    @DisplayName ("Prueba repetida: ")
    @RepeatedTest(value = 4, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void testRepetido(RepetitionInfo info){
        System.out.println("Repetición #" + info.getCurrentRepetition());
        assertEquals(4, info.getTotalRepetitions());
    }
   
    @BeforeEach
    public void before(){
       System.out.println("Anotation @Before"); 
// Para observar la llamada antes de cada prueba
       instance = new Calculator();
       a = 1;
       b = 1;
    }
   /**
    * Ejemplo 10.
    */
    @ParameterizedTest(name = "{0} + {1} = {2}") 
    @CsvSource({
	"0,    1,   1",
	"1,    2,   3",
	"49,  51, 100",
	"1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
	assertEquals(expectedResult, calculator.add(first, second),
	() -> first + " + " + second + " debe ser igual a " + expectedResult);
    }
    /**
     Ejemplo 11.
     Prueba parametrizada de la multiplicación
     */
    @ParameterizedTest( name = "{0} * {1} =  {2}" )
    @CsvSource({
        "0, 1, 0",
        "-4, 4, -16",
        "-4, -4, 16",
        "0, 0, 0"
        })
    void multiplicacion(int primero, int segundo, int resultadoesperado){
        Calculator m = new Calculator();
        assertEquals(resultadoesperado, m.multiplicar(primero, segundo), 
                () -> primero + " * " + segundo + "  = " + resultadoesperado);
    }
    
     /**
     Ejemplo 12.
     Prueba parametrizada de la multiplicación
     */
    @AfterEach
   public void after(){
      System.out.println("Anotations @After");
// Para observar la llamada después de cada prueba
       instance.limpiar();
   }
}
