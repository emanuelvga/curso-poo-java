package ex09b;

public class Livro implements Publicacao{
    //Atributo

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos Públicos


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo = '" + titulo + '\n' +
                " autor = '" + autor + '\n' +
                " totPaginas = " + totPaginas + '\n' +
                " pagAtual = " + pagAtual + '\n' +
                " aberto = " + aberto + '\n' +
                " leitor = " + leitor.getNome() + '\n' +
                " Idade = " + leitor.getIdade() +'\n' +
                " Sexo = " + leitor.getSexo();

    }

    @Override
    public void abir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        if(p > totPaginas){
            this.pagAtual = 0;
        }else
        {this.pagAtual = p;}
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarpag() {
        this.pagAtual --;

    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public boolean isAberto(){
        return this.aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
}
