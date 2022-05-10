import javax.swing.*;
import java.awt.event.ActionListener;

public class PaginaDois {
    private final Frame frame; //Declara a classe com JFrame e JPanel
    private final JButton button; //Declara um botão

    public PaginaDois(){
        frame = new Frame("PaginaDois",500,200); //Cria frame com parâmetros
        button = new JButton("Botão"); //Cria botão

        setBounds(); //Chama método setBounds();
        addComponents(); //Chama método addComponents();
        setUpButtonListeners(); //Chama método setUpButtonListeners();
        frame.loadScreen(); //Chama método de frame.loadScreen();
    }

    public void setBounds(){ //Adiciona a posição e tamanho de cada elemento
        button.setBounds(200,75,100,25); //Posição na tela, e tamanho a partir da posição
    }

    public void addComponents(){ //Adiciona os componentes
        frame.add(button);
    }

    public void setUpButtonListeners(){ //Cria o "Scanner" para os botões
        ActionListener buttonListener = e -> {
            if(e.getSource() == button) { //Verifica qual botão foi apertado (Caso tenha mais de um botão)
                frame.poof(); //Remove a tela
                new PaginaUm(); //Chama uma classe
            }
        };
        button.addActionListener(buttonListener); //Adiciona o botão no "Scanner"
    }
}