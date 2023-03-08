package ex07b;

public class Lutador {
    //atributos.
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos.

    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }

    //Métodos especiais.

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso<=120.2){
            this.categoria = "Pesado";
        }else{
            System.out.println("Invalido");
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int em){
        this.empates = em;

    }
}
