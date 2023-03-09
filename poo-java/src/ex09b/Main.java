package ex09b;

public class Main {
    public static void main(String[] args) {
        Pessoa p [] = new Pessoa[2];
        Livro l [] = new  Livro[3];

        p[0] = new Pessoa("Pedro", 32,"Masculino");
        p[1] = new Pessoa("Maria",25,"Feminino");

        l[0] = new Livro("Aprendendo Java","Augusto da Fonseca", 250,p[1]);
        l[1] = new Livro("POO para Iniciantes", "Mario Cortela", 350,p[0]);
        l[2] = new Livro("Java avançado","Maria Augustina", 450,p[0]);

        l[0].abir();
        l[0].folhear(250);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());



    }
}
