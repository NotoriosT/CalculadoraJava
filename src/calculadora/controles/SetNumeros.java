package calculadora.controles;

import calculadora.display.Display;

public class SetNumeros {


    public static void setNumero(String numero){
        if (!Display.getTextoLabel().equals("0")){
            Display.setTextoLabel(Display.getTextoLabel()+numero);
            return;}
        Display.setTextoLabel(numero);
    }


    }

