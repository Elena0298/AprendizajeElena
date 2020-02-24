package Lambdas;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLambda {


    public static void main(String[] args) {
        IDecirHola saludo = (nombre) -> "Hola "+nombre;
        String nombre = "";
        if (nombre != ""){
            System.out.println(saludo.decirHola(nombre));
        }else {
            System.out.println(saludo.decirHolaDefault());
        }
    }
}

@FunctionalInterface
interface IDecirHola{
    public String decirHola(String nombre);
    public default String decirHolaDefault(){
        return "Hola por defecto";
    }
}
