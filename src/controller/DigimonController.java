package controller;
import model.Digimon;




public class DigimonController {
    void verificarFome(Digimon digimon){
        if(digimon.getFome() < 1){
            System.out.println("Seu digimon morreu de fome. Sua fome chegou a 0");
        } else if (digimon.getFome() <= 3) {
            System.out.println("Seu digimon está com bastante fome! Sua fome está em " + digimon.getFome());
        } else if (digimon.getFome() < 6) {
            System.out.println("Seu digimon está um pouco faminto! Sua fome está em " + digimon.getFome());
        }else if (digimon.getFome() <= 9){
            System.out.println("Seu digimon está bem alimentado! Sua fome está em " + digimon.getFome());
        } else if (digimon.getFome() >= 10) {
            System.out.println("Seu digimon está bem alimentado! Não o alimente demais!");
        }
    }

    void verificarFelicidade(Digimon digimon){
        if(digimon.getFelicidade() < 1){
            System.out.println("Seu digimon está bem chateado! Sua felicidade está em " + digimon.getFelicidade());
        } else if (digimon.getFelicidade() <= 3) {
            System.out.println("Seu digimon está um pouco chateado! Sua felicidade está em " + digimon.getFelicidade());
        } else if (digimon.getFelicidade() < 6) {
            System.out.println("Seu digimon está satisfeito! Sua felicidade está em " + digimon.getFelicidade());
        }else if (digimon.getFelicidade() <= 9){
            System.out.println("Seu digimon está feliz! Sua felicidade está em" + digimon.getFelicidade());
        } else if (digimon.getFelicidade() >= 10) {
            System.out.println("Seu digimon está bem feliz! Não o mime demais!");
        }
    }

    void verificarIdade(Digimon digimon){
        System.out.println("Seu digimon tem " + digimon.getIdade());
    }
    void verificarPeso(Digimon digimon){
        if(digimon.getPeso() <= 2){
            System.out.println("Seu digimon está um pouco magro! Seu peso está em " + digimon.getPeso());
        } else if (digimon.getPeso() >= 5) {
            System.out.println("Seu digimon está bem gordinho! Seu peso está em " + digimon.getPeso());
        }
    }

    void verificarBanheiro(Digimon digimon){
        if (digimon.getBanheiro()){
            System.out.println("Quer ir ao banheiro!");
        }
        else{
            System.out.println("Não quer ir ao banheiro!");
        }
    }
    void verificarApelido(Digimon digimon){
        System.out.println("O apelido do seu digimon é " + digimon.getApelido());
    }

    // aumentar

    public boolean alimentar(Digimon digimon){
        if(digimon.getFome() >= 10){
            digimon.aumentarFome(0);
            return false;
        }
        else if (digimon.getFome() + 2 >= 10) {
            digimon.aumentarFome(1);
            return true;
        } else{
            digimon.aumentarFome(2);
            return true;
        }
    }

    public boolean alimentarpeso(Digimon digimon){
        if(digimon.getPeso() >= 20){
            digimon.aumentarPeso(0);
            return false;
        }else if (digimon.getPeso() + 1 >= 20 ){
            digimon.aumentarPeso(1);
            return true;
        }else{
            digimon.aumentarPeso(1);
            return true;
        }
    }
    public boolean passear(Digimon digimon){
        if(digimon.getFelicidade() >= 10){
            digimon.aumentarFelicidade(0);
            return false;
        }
        else if (digimon.getFelicidade() + 2 >= 10) {
            digimon.aumentarFelicidade(1);
            return true;
        } else{
            digimon.aumentarFelicidade(2);
            return true;
        }
    }

    public boolean passearPeso(Digimon digimon){
        if(digimon.getPeso() <= 0){
            digimon.diminuirPeso(0);
            return false;
        }else if (digimon.getPeso() - 1 >= 0 ){
            digimon.diminuirPeso(1);
            return true;
        }else{
            digimon.diminuirPeso(1);
            return true;
        }
    }

    public boolean passearFome(Digimon digimon){
        if(digimon.getFome() <= 0){
            digimon.diminuirFome(0);
            return false;
        }else if (digimon.getFome() - 1 >= 0 ){
            digimon.diminuirFome(1);
            return true;
        }else{
            digimon.diminuirFome(1);
            return true;
        }
    }
    public void irBanheiro(Digimon digimon){
        digimon.setBanheiro(false);
    }
    public void darApelido(Digimon digimon){
        String apelidoatual;

    }
}
