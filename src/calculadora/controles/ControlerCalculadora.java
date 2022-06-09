package calculadora.controles;


import calculadora.display.Display;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ControlerCalculadora {

    @FXML
    public Label label=new Label("0");
    @FXML
    void botao1(){
        Botoes.BOTAO1.selecaoBotao();
        label.setText(Display.getTextoLabel());

        ajustarTamanhoFonte();
    }
    @FXML
    void botao2(){
        Botoes.BOTAO2.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao3(){
        Botoes.BOTAO3.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao4(){
        Botoes.BOTAO4.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao5(){
        Botoes.BOTAO5.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao6(){
        Botoes.BOTAO6.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao7(){
        Botoes.BOTAO7.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao8(){
        Botoes.BOTAO8.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao9(){
        Botoes.BOTAO9.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botao0(){
        Botoes.BOTAO0.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoAC(){
        Botoes.BOTAOAC.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoVirgula(){
        Botoes.BOTAOVIRGULA.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoMais(){
        Botoes.BOTAOSOMA.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoIgual(){
        Botoes.BOTAOIGUAL.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoMenos(){
        Botoes.BOTAOMENOS.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoVezes(){
        Botoes.BOTAOVEZES.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoDIV(){
        Botoes.BOTAODIV.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoPorcentagem(){
        Botoes.BOTAOPORCETAGEM.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    @FXML
    void botaoSinal(){
        Botoes.BOTAOSINAL.selecaoBotao();
        label.setText(Display.getTextoLabel());
        ajustarTamanhoFonte();
    }
    private void ajustarTamanhoFonte(){
        final int TAMANHO_FONTE=44;
        int tamanho=TAMANHO_FONTE;
        Text text=new Text(label.getText());
        do {
            text.setFont(new Font(label.getFont().getName(),tamanho));
            label.setStyle("-fx-font-size:"+tamanho+"px;");
        tamanho--;
        }while(text.getBoundsInLocal().getWidth()>245);


}}
