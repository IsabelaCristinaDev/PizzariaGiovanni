/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzariagiovanni;

public class PizzaFactory {
    private PizzaFactory() {
       
    }

    public static Pizza getInstance(String tipoPizza) {
        switch (tipoPizza) {
            case "Chocolate":
                return new ChocolatePizza();
            case "Pepperoni":
                return new PepperoniPizza();
            case "Margherita":
                return new MargheritaPizza();
            default:
                throw new IllegalArgumentException("Tipo de pizza não suportado: " + tipoPizza);
        }
    }
}