package ex05a;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC"){
            saldo = 50;
        }else if (t == "CP"){
            saldo = 150;
        }

    }
    public void fecharConta() {
        if (saldo > 0){
            System.out.println("Conta com dinheiro." + saldo);
        }
        else if (saldo < 0){
            System.out.println("Conta com débito." + saldo);
        }
        else{
            setStatus(false);
        }
    }
    public void depositar(float v) {
        if (getStatus()){
            float saldoAtual = getSaldo();
            setSaldo(saldoAtual + v);
        }
        else {
            System.out.println("Não é possivel depositar.");
        }
    }
    public void sacar(float v) {
        if (getStatus()){
            if (saldo >= v){
                saldo = saldo - v;
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossivel sacar.");
        }
    }
    public void pagarMensal() {
        float v = 0;
        if(getTipo() == "CC"){
            v = 12;
        }
        else if (getTipo() == "CP"){
            v = 20;
        }
        if (getStatus()){
            if(saldo > v){
                saldo = saldo - v;
            }
            else{
                System.out.println("Saldo insuficiente.");
            }

        }
        else{
            System.out.println("Impossivel pagar.");
        }
    }

    public void Construtor() {
        saldo = 0;
        status = false;
    }
    public void setNumConta(int n) {
        numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String t) {
        tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    public void setDono(String d) {
        dono = d;
    }
    public String getDono() {
        return dono;
    }
    public void setSaldo(float s) {
        saldo = s;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setStatus(boolean st) {
        status = st;
    }
    public boolean getStatus() {
        return status;
    }
}
