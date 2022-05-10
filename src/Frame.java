import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Frame {
    /*
    Coloquei o JFrame e o JPanel em uma classe só porque todas as classes vão ter eles
    e também para reduzir o código colocando o loadScreen();
    */

    private final JFrame frame; //Declara uma janela
    private final JPanel panel; //Declara um painel que ajuda na hora de adicionar os componentes
    public Frame(String titulo, int largura, int altura){ //O titulo que aparece no topo da janela
        frame = new JFrame(titulo); //Cria uma janela com o título
        frame.setSize(largura, altura); //Define o tamanho da tela (Tirar a linha não quebra a execução)
        panel = new JPanel(); //Cria um painel
    }
    public void poof(){ //Método que criei para poder remover uma tela
        frame.setVisible(false);
    }

    public void add(Component o){ //Método que criei para adicionar componentes, botões, etc...
        panel.add(o);
    }
    public void loadScreen(){
        panel.setLayout(null); //Deixa eu fazer um layout bonito sem ter q usar LayoutManager

        frame.setResizable(false); //Impede de mudar o tamanho (Tirar a linha não quebra a execução) default true
        frame.setLocationRelativeTo(null); //Faz a janela aparecer no meio da tela (Tirar a linha não quebra a execução)
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //Se a janela for fechada no botão, o programa para

        frame.add(panel); //Aplica as mudanças no painel a janela
        frame.setVisible(true); //Mostra a janela
    }
}