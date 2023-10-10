package model;

public class ProfessorModel {
    private String codigo;
    private String nome;
    private String especialidade;
    private String dataAdmissao;
    private String codigoDisciplina;

    public ProfessorModel(String codigo, String nome, String especialidade, String dataAdimissao, String codigoDisciplina) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataAdmissao = dataAdimissao;
        this.codigoDisciplina = codigoDisciplina;
    }

    public ProfessorModel(String codigo, String nome, String especialidade, String dataAdimissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataAdmissao = dataAdimissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    @Override
    public String toString() {
        return "ProfessorModel{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", codigoDisciplina='" + codigoDisciplina + '\'' +
                '}';
    }
}
