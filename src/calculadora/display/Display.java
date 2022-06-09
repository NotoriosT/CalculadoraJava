package calculadora.display;

public class Display {
   static private String textoLabel="0";
   static private String textoBuffer="0";
   static private String bufferLogica="";
    public static String getTextoBuffer() {
        return textoBuffer;
    }

    public static void setTextoBuffer(String textoBuffer) {
        Display.textoBuffer = textoBuffer;
    }

    public static String getBufferLogica() {
        return bufferLogica;
    }

    public static void setBufferLogica(String bufferLogica) {
        Display.bufferLogica = bufferLogica;
    }

    public static String getTextoLabel() {
        return textoLabel;
    }

    public Display() {
        textoLabel="0";
    }

public static void setTextoLabel(String textoLabel) {
        Display.textoLabel = textoLabel;
    }
   }
