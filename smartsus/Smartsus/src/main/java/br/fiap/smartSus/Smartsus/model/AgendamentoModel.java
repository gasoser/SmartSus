package br.fiap.smartSus.Smartsus.model;

public class AgendamentoModel {
  private String nome;
  private String preco;
  private String data;
  private int agendamentoId;
  private int usuarioId;
  private int clinicaId;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getPreco() {
    return preco;
  }
  public void setPreco(String preco) {
    this.preco = preco;
  }
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  public int getAgendamentoId() {
    return agendamentoId;
  }
  public void setAgendamentoId(int agendamentoId) {
    this.agendamentoId = agendamentoId;
  }
  public int getUsuarioId() {
    return usuarioId;
  }
  public void setUsuarioId(int usuarioId) {
    this.usuarioId = usuarioId;
  }
  public int getClinicaId() {
    return clinicaId;
  }
  public void setClinicaId(int clinicaId) {
    this.clinicaId = clinicaId;
  }
  public AgendamentoModel(String nome, String preco, String data, int agendamentoId, int usuarioId, int clinicaId) {
    this.nome = nome;
    this.preco = preco;
    this.data = data;
    this.agendamentoId = agendamentoId;
    this.usuarioId = usuarioId;
    this.clinicaId = clinicaId;
  }
  @Override
  public String toString() {
    return "AgendamentoModel [nome=" + nome + ", preco=" + preco + ", data=" + data + ", agendamentoId=" + agendamentoId
        + ", usuarioId=" + usuarioId + ", clinicaId=" + clinicaId + "]";
  }

  
}
