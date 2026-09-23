package view;

import javax.swing.*;
import java.awt.*;
import model.Digimon;
import controller.DigimonController;
import model.Guilmon;


public class DigimonTela  extends JFrame {
    public static void main(String[] args) {
        Digimon guilmon = new Guilmon();
        DigimonController controller = new DigimonController();
        guilmon.setFome(5);
        guilmon.setFelicidade(5);
        guilmon.setPeso(5);
        guilmon.setBanheiro(false);
        guilmon.setIdade(1);
        JFrame tela = new JFrame("TAMAGOTCHI");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Digimon Tamagotchi");
        ImageIcon Jyarimon = new ImageIcon("src/images/Guilmon01.gif");
        JLabel imagem = new JLabel(Jyarimon);
        JLabel fome = new JLabel("Fome: " + guilmon.getFome());
        JLabel felicidade = new JLabel("Felicidade: " + guilmon.getFelicidade());
        JLabel peso = new JLabel("Peso: " + guilmon.getPeso());
        JLabel idade = new JLabel("Idade: " + guilmon.getIdade());
        JLabel banheiro;

        if (guilmon.getBanheiro()) {
            banheiro = new JLabel("Banheiro: Precisa");
        } else {
            banheiro = new JLabel("Banheiro: Não precisa");
        }
        JButton alimentar = new JButton();
        JButton passear = new JButton();
        JButton iraoBanheiro = new JButton();
        JButton status = new JButton();
        JPanel painelBotoes = new JPanel();
        JPanel painelStatus = new JPanel();
        JPanel painelFoto = new JPanel();
        JPanel painelTitulo = new JPanel();
        JPanel itenscentro = new JPanel();

        itenscentro.setLayout(new BoxLayout(itenscentro, BoxLayout.Y_AXIS));
        alimentar.setText("Alimentar");
        passear.setText("Passear");
        iraoBanheiro.setText("Ir ao Banheiro");
        status.setText("Status");
        painelTitulo.add(titulo);
        painelFoto.add(imagem);
        painelStatus.add(fome);
        painelStatus.add(felicidade);
        painelStatus.add(peso);
        painelStatus.add(idade);
        painelStatus.add(banheiro);
        painelBotoes.add(alimentar);
        painelBotoes.add(passear);
        painelBotoes.add(iraoBanheiro);
        painelBotoes.add(status);
        itenscentro.add(painelFoto);
        itenscentro.add(painelStatus);

        //ACTION LISTENERS

        alimentar.addActionListener(e -> {
            controller.alimentar(guilmon);
            fome.setText("Fome : " + guilmon.getFome());
            peso.setText("Peso " + guilmon.getPeso());
        });
        passear.addActionListener(e -> {
            controller.passear(guilmon);
            felicidade.setText("Felicidade : " + guilmon.getFelicidade());
            peso.setText("Peso " + guilmon.getPeso());
        });
        iraoBanheiro.addActionListener(e -> {
            controller.irBanheiro(guilmon);
            if (guilmon.getBanheiro()){
                banheiro.setText("Banheiro: Precisa");
            }else{
                banheiro.setText("Banheiro: Não precisa");
            }
        });

        panel.add(painelTitulo, BorderLayout.NORTH);
        panel.add(itenscentro, BorderLayout.CENTER);
        panel.add(painelBotoes, BorderLayout.SOUTH);
        tela.add(panel);
        tela.setSize(600, 600);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
