public class Aluno {

    //Declaração dos atributos da Classe Alunos
    private int Matricula;
    private String Nome;
    private String Email;

    //Definição do Construtor
    Aluno(String nome, String email) {
        Nome = nome;
        Email = email;
    }

    //Criando os getters e setters para os atributos
    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

} //Fim da Classe