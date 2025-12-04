import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    //Declaração dos atributos da Classe Disciplinas
    private String Codigo;
    private String Titulo;
    private int CapMax;
    private List<Aluno> Matriculado;

    //Definição do Construtor
    Disciplina(String Ref, String Disciplina, int Limite) {
        Codigo = Ref;
        Titulo = Disciplina;
        CapMax = Limite;
        Matriculado = new ArrayList<>();
    }

    boolean isCompleta() {
        return Matriculado.size() >= CapMax;
    }

    List<Aluno> getAlunos() {
        return new ArrayList<>(Matriculado);
    }

    //Criando os getters e setters para os atributos
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int capMax) {
        CapMax = capMax;
    }

    public List<Aluno> getMatriculado() {
        return Matriculado;
    }

    public void setMatriculado(List<Aluno> matriculado) {
        Matriculado = matriculado;
    }
} //Fim da Classe