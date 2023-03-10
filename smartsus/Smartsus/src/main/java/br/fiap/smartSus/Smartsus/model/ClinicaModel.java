package br.fiap.smartSus.Smartsus.model;

public class ClinicaModel {
  private String nome;
  private String especialidade;
  private String cnpj;
  private String preco;
  private char clinicaId;
  
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
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
  public String getPreco() {
    return preco;
  }
  public void setPreco(String preco) {
    this.preco = preco;
  }
  public char getClinicaId() {
    return clinicaId;
  }
  public void setClinicaId(char clinicaId) {
    this.clinicaId = clinicaId;
  }
  public ClinicaModel(String nome, String especialidade, String cnpj, String preco, char clinicaId) {
    this.nome = nome;
    this.especialidade = especialidade;
    this.cnpj = cnpj;
    this.preco = preco;
    this.clinicaId = clinicaId;
  }
  
  @Override
  public String toString() {
    return "ClinicaModel [nome=" + nome + ", especialidade=" + especialidade + ", cnpj=" + cnpj + ", preco=" + preco
        + ", clinicaId=" + clinicaId + "]";        
  }
}
