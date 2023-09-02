package edu.ejercicios;

import Pizza.base.Pizza;
import Pizza.base.Topping;
import Pizza.especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {
  //Ejercicio 1
//    Pizza pizza = new Pizza ("Pizza Margherita",10.99 );
//    pizza.addTopping (new Topping("Tomato"));
//    pizza.addTopping (new Topping("Mozarrella"));
//    pizza.addTopping(new Topping("Basil"));
//    pizza.prepare();


        PizzaItaliana pizza = new PizzaItaliana ("Pizza italiana",10.99,"Tomato sauce");
        pizza.addTopping (new Topping("Tomato",12));
        pizza.addTopping (new Topping("Mozarrella",10));
        pizza.addTopping(new Topping("Basil",10));
        pizza.prepare();
//        System.out.println("this is the salsa: "+pizza.getSalsa());



    }
}