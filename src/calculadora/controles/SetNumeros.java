package calculadora.controles;

import calculadora.display.Display;

public class SetNumeros {


    public static void setNumero(String numero){
        if (!Display.getTextoLabel().equals("0")){
            Display.setTextoLabel(Display.getTextoLabel()+numero);
            return;}
        Display.setTextoLabel(numero);
    }
    public  static void porcetagem(){
        float result;
        boolean inteiro;
        if (!Display.getTextoLabel().equals("0")&&Display.getTextoBuffer().equals("0")) {
            Display.setTextoBuffer(Display.getTextoLabel());
            Display.setTextoLabel("0");
            Display.setBufferLogica("%");
            return;
        }
        result=Float.parseFloat(Display.getTextoBuffer())*(Float.parseFloat(Display.getTextoLabel())/100);
        inteiro=Float.toString(result).endsWith(".0");
        Display.setTextoLabel(inteiro?Float.toString(result).replace(".0",""):Float.toString(result));
        Display.setTextoBuffer("0");
        Display.setBufferLogica("");

    }

public static void adcao(){
    float result;
    boolean inteiro;
    if (!Display.getTextoLabel().equals("0")&&Display.getTextoBuffer().equals("0")) {
        Display.setTextoBuffer(Display.getTextoLabel());
        Display.setTextoLabel("0");
        Display.setBufferLogica("+");
        return;
    }
    result=Float.parseFloat(Display.getTextoBuffer())+Float.parseFloat(Display.getTextoLabel());
    inteiro=Float.toString(result).endsWith(".0");
    Display.setTextoLabel(inteiro?Float.toString(result).replace(".0",""):Float.toString(result));
    Display.setTextoBuffer("0");
    Display.setBufferLogica("");
}

public  static void divisao() {
    float result = 0;
    boolean inteiro;
    if (!Display.getTextoLabel().equals("0")&&Display.getTextoBuffer().equals("0")) {
        Display.setTextoBuffer(Display.getTextoLabel());
        Display.setTextoLabel("0");
        Display.setBufferLogica("/");
        return;
    }
    if (!Display.getTextoLabel().equals("0")){
        System.out.println(Display.getTextoLabel());
        result=Float.parseFloat(Display.getTextoBuffer())/Float.parseFloat(Display.getTextoLabel());}
    inteiro=Float.toString(result).endsWith(".0");
    Display.setTextoLabel(inteiro?Float.toString(result).replace(".0",""):Float.toString(result));
    Display.setTextoBuffer("0");
    Display.setBufferLogica("");
}

    public static void subtracao() {
        float result;
        boolean inteiro;
        if (!Display.getTextoLabel().equals("0")&&Display.getTextoBuffer().equals("0")) {
            Display.setTextoBuffer(Display.getTextoLabel());
            Display.setTextoLabel("0");
            Display.setBufferLogica("-");
            return;
        }
        result=Float.parseFloat(Display.getTextoBuffer())-Float.parseFloat(Display.getTextoLabel());
        inteiro=Float.toString(result).endsWith(".0");
        Display.setTextoLabel(inteiro?Float.toString(result).replace(".0",""):Float.toString(result));
        Display.setTextoBuffer("0");
        Display.setBufferLogica("");
    }


    public static void vezes() {
        float result;
        boolean inteiro;
        if (!Display.getTextoLabel().equals("0")&&Display.getTextoBuffer().equals("0")) {
            Display.setTextoBuffer(Display.getTextoLabel());
            Display.setTextoLabel("0");
            Display.setBufferLogica("x");

            return;
        }

        result=Float.parseFloat(Display.getTextoBuffer())*Float.parseFloat(Display.getTextoLabel());
        inteiro=Float.toString(result).endsWith(".0");
        Display.setTextoLabel(inteiro?Float.toString(result).replace(".0",""):Float.toString(result));
        Display.setTextoBuffer("0");
        Display.setBufferLogica("");
    }

    public static void sinal() {
        if (!Display.getTextoLabel().equals("0")) {

            if (Display.getTextoLabel().contains("-")){
                Display.setTextoLabel(Display.getTextoBuffer().substring(1));
                return;
            }
            Display.setTextoLabel("-"+Display.getTextoLabel());

        }
    }
}

