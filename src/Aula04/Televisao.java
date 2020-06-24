package Aula04;
// canal vai de 1 a 99
// volume vai de 0 a 10   
// aumentarVolume, diminuirVolume, voltarCanal, mutar
public class Televisao{
    private String  marca;
    private int     tamanhoTela;
    private int     canal;
    private int     volume;
    private boolean ligada;

    // metodo construtor
    public Televisao(String novaMarca, int novoTamanho){
        marca = novaMarca;
        tamanhoTela = novoTamanho;
        canal = 1;
        volume = 0;
        ligada = false;
    }

    void setMarca(String novaMarca){
        // posso colocar uma rotina de validacao
        marca = novaMarca;
    }

    String getMarca(){
        return marca;
    }

    void setTamanhoTela(int novoTamanho){
        tamanhoTela = novoTamanho;
    }
    int getTamanhoTela(){
        return tamanhoTela;
    }
    
    int getCanal(){
        return canal;
    }

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }
    boolean avancarCanal(){
        boolean deuCerto;
        if (ligada == true){
            canal++;
            if (canal >= 99){
                canal = 99;
            }
            deuCerto = true;
        }
        else{
           deuCerto = false;
        }
        return deuCerto;
    }

    void voltarCanal(){
        if (ligada == true){
            canal--;
            if (canal <= 1 ){
                canal = 1;
            }
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void aumentarVolume(){
        if (ligada){
            volume++;
            if (volume >=10){
                volume = 10;
            }
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void diminuirVolume(){
        if (ligada){
            volume--;
            if (volume <=0){
                volume = 0;
            }
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void mutar(){
        if (ligada){
            volume = 0;
            System.out.println("TV "+marca+" esta no mudo!");
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }



    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }
}