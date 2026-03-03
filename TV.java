/*
Edite o arquivo TV.java e construa uma modelagem para representar uma TV utilizando as informações abaixo.

Uma televisão possui as seguintes características:

tamanho de tela (em polegadas);
volume: de 1 a 10 iniciando em 5 (somente no construtor);
marca;
voltagem (220 e 110);
canal.
A televisão pode realizar as seguintes ações:

ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas;
desligar;
aumentar e diminuir o volume;
subir e descer canal.
*/
public class Tv {
    private int tamanhoTela;
    private String marca;
    private String canal;
    private int voltagem;
    private int volume = 5;
    private int consumo;


    public Tv(int tamanhoTela, String marca, String canal, int voltagem) {
        this.tamanhoTela = tamanhoTela;
        this.marca = marca;
        this.canal = canal;
        this.voltagem  = voltagem;
        this.volume = 5;
    }
    
    public void ligar() {
        consumo = voltagem * tamanhoTela;
        System.out.println("Consumo: " + consumo);
    }

    public void desligar() {
        
    }

    public int aumentarVolume(){
        if ( this.volume < 10){
            this.volume++;
        } else{
            System.out.println("Erro ao aumentar volume");
        }
        return this.volume;
    }

    public int diminuirVolume(){
        if ( volume <= 1 )
            
    }
}
