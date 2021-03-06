package calculadora.controles;

import calculadora.display.Display;

public enum Botoes {

    BOTAOAC {
        @Override
        public void selecaoBotao() {
           Display.setBufferLogica("");
           Display.setTextoBuffer("0");
           Display.setTextoLabel("0");
        }
    }, BOTAOSINAL {
        @Override
        public void selecaoBotao() {

          SetNumeros.sinal();


        }
    }, BOTAOPORCETAGEM {
        @Override
        public void selecaoBotao() {
          SetNumeros.porcetagem();
        }
    }, BOTAODIV {
        @Override
        public void selecaoBotao() {
        SetNumeros.divisao();

        }
    }, BOTAOSOMA {
        @Override
        public void selecaoBotao() {
           SetNumeros.adcao();

        }

    }, BOTAOMENOS {
        @Override
        public void selecaoBotao() {
          SetNumeros.subtracao();

        }
    }, BOTAOVEZES {
        @Override
        public void selecaoBotao() {
         SetNumeros.vezes();
        }
    },
    BOTAO1 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("1");
    }},
    BOTAO2 {
        @Override
        public void selecaoBotao() {
                SetNumeros.setNumero("2");
            }

        }
    , BOTAO3 {
        @Override
        public void selecaoBotao() {
        SetNumeros.setNumero("3");
        }
    }, BOTAO4 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("4");

        }
    }, BOTAO5 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("5");

        }
    }, BOTAO6 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("6");

        }
    }, BOTAO7 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("7");

        }
    }, BOTAO8 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("8");

        }
    }, BOTAO9 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("9");

        }

        }, BOTAOVIRGULA {
            @Override
            public void selecaoBotao() {

                if (Display.getTextoLabel().equals("0")){
                    Display.setTextoLabel("0.");
                }
            }
        }, BOTAO0 {
        @Override
        public void selecaoBotao() {
            SetNumeros.setNumero("0");
        }
    }, BOTAOIGUAL {
        @Override
        public void selecaoBotao() {
            if (Display.getBufferLogica().equals("%")){
                BOTAOPORCETAGEM.selecaoBotao();
                Display.setTextoBuffer("0");
                Display.setBufferLogica("");
            }
            if (Display.getBufferLogica().equals("/")){
               BOTAODIV.selecaoBotao();
                Display.setTextoBuffer("0");
                Display.setBufferLogica("");
            }
            if (Display.getBufferLogica().equals("-")){
                BOTAOMENOS.selecaoBotao();
                Display.setTextoBuffer("0");
                Display.setBufferLogica("");
            }
            if (Display.getBufferLogica().equals("x")){
                BOTAOVEZES.selecaoBotao();
                Display.setTextoBuffer("0");
                Display.setBufferLogica("");
            }
            if (Display.getBufferLogica().equals("+")){
                BOTAOSOMA.selecaoBotao();
                Display.setTextoBuffer("0");
                Display.setBufferLogica("");
            }




        }
    };


    public abstract void selecaoBotao();
}
