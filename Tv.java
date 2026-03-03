public class Tv {
    private int tamanhoTela;
    private String marca;
    private int canal;
    private int voltagem;
    private int volume;
    private int consumo;
    private boolean ligada;

    public Tv(int tamanhoTela, String marca, int voltagem) {
        this.tamanhoTela = tamanhoTela;
        this.marca = marca;
        this.canal = 1;
        this.voltagem  = voltagem;
        this.volume = 5;
        this.ligada = false;
    }
    
    public void ligar() {
        if (this.ligada == true) {
            System.out.println("a Tv já está ligada");
        } else {
            this.ligada = true;
        }
        consumo = voltagem * tamanhoTela;
        System.out.println("Consumo: " + consumo);
    }

    public void desligar() {
        if (this.ligada == false) {
            System.out.println("a Tv já está desligada");
        } else {
            this.ligada = false;
        }
        System.out.println("Desligando: " + marca);
    }

    public int aumentarVolume() {
        if ( this.volume >= 10 || this.ligada == false) {
            System.out.println("Erro ao aumentar volume");
        } else{
            this.volume++;
        }
        return this.volume;
    }

    public int diminuirVolume() {
        if ( volume == 1 ||  this.ligada == false) {
            System.out.println("Erro ao diminuir volume");
        } else {
            this.volume--;
        }
        return this.volume;
    }

    public void subirCanal() {
        if (this.ligada == false) {
            System.out.println("Erro ao subir canal");
            return;
        }
        this.canal++;
        System.out.println("Canal atual: " + this.canal);
    }

    public void descerCanal() {
        if (this.ligada == false) {
            System.out.println("Erro ao descer canal");
            return;
        }
        if (this.canal > 1) {
            this.canal--;
            System.out.println("Canal atual: " + this.canal);
        } else {
            System.out.println("Você já está no primeiro canal.");
        }
    }
}
