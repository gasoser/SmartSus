package br.fiap.smartSus.Smartsus.model;

public class UsuarioModel {

  private String email;
  private String senha;
  private String celular;
  private String usuarioId;
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }
  public String getUsuarioId() {
    return usuarioId;
  }
  public void setUsuarioId(String usuarioId) {
    this.usuarioId = usuarioId;
  }
  public UsuarioModel(String email, String senha, String celular, String usuarioId) {
    this.email = email;
    this.senha = senha;
    this.celular = celular;
    this.usuarioId = usuarioId;
  }
  @Override
  public String toString() {
    return "UsuarioModel [email=" + email + ", senha=" + senha + ", celular=" + celular + ", usuarioId=" + usuarioId
        + "]";
  }
  
}
