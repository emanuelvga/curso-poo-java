package ex04b;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    public int carga;
    public boolean tampada;

    public  Caneta(String m, String c, float p ) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.setTampada(true);
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("tampada? " + this.getTampada());
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(boolean t) {
        this.tampada = t;
    }
}





