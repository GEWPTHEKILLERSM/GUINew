import javax.swing.*;
import java.awt.event.ActionListener;

public class Contador {
    private final Frame frame; //Declara a classe com JFrame e JPanel
    private final JButton button1, button2; //Declara um botão
    private final JLabel label; //Declara um rótulo
    private int contador; //Declara um inteiro

    public Contador(){
        frame = new Frame("Contador",500,200); //Cria frame com parâmetros
        button1 = new JButton("Adicionar"); //Cria botão com texto
        button2 = new JButton("Remover"); //Cria botão com texto
        contador = 0; //Inicia o inteiro com 0
        label = new JLabel("Contador possui ' "+contador+" ' números.");//Cria um rótulo com texto


        setBounds(); //Chama método setBounds();
        addComponents(); //Chama método addComponents();
        setUpButtonListeners(); //Chama método setUpButtonListeners();
        frame.loadScreen(); //Chama método de frame.loadScreen();
    }

    public void setBounds(){ //Adiciona a posição e tamanho de cada elemento
        button1.setBounds(125,50,100,25); //Posição na tela, e tamanho a partir da posição
        button2.setBounds(225,50,100,25); //Posição na tela, e tamanho a partir da posição
        label.setBounds(125,80,200,25); //Posição na tela, e tamanho a partir da posição
    }

    public void addComponents(){ //Adiciona os componentes
        frame.add(button1);
        frame.add(button2);
        frame.add(label);
    }

    public void setUpButtonListeners(){ //Método para criar um "Scanner" para os botões
        ActionListener buttonListener = e -> { //Cria um "Scanner"
            if(e.getSource() == button1){ //Verifica qual botão foi apertado
                contador++; //Adiciona + 1 no contador
            } else if (e.getSource() == button2) { //Verifica qual botão foi apertado
                contador--; //Remove - 1 no contador
            }
            label.setText("Contador possui ' "+contador+" ' números"); //Atualiza o texto de label
        };
        button1.addActionListener(buttonListener); //Adiciona o botão no "Scanner"
        button2.addActionListener(buttonListener); //Adiciona o botão no "Scanner"
    }
}