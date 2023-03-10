package br.fiap.smartSus.Smartsus.model;

public class CartaoModel {

  private String numeroCartao; 
  private String nomeCartao;
  private String validadeCartao;
  private char Cvv; 
  private String cpf;
  private String cartaoId;

  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }
  public String getNomeCartao() {
    return nomeCartao;
  }
  public void setNomeCartao(String nomeCartao) {
    this.nomeCartao = nomeCartao;
  }
  public String getValidadeCartao() {
    return validadeCartao;
  }
  public void setValidadeCartao(String validadeCartao) {
    this.validadeCartao = validadeCartao;
  }
  public char getCvv() {
    return Cvv;
  }
  public void setCvv(char cvv) {
    Cvv = cvv;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getCartaoId() {
    return cartaoId;
  }
  public void setCartaoId(String cartaoId) {
    this.cartaoId = cartaoId;
  }

  public CartaoModel(String numeroCartao, String nomeCartao, String validadeCartao, char cvv,
    String cpf, String cartaoId) {
    this.numeroCartao = numeroCartao;
    this.nomeCartao = nomeCartao;
    this.validadeCartao = validadeCartao;
    Cvv = cvv;
    this.cpf = cpf;
    this.cartaoId = cartaoId;
  }

  @Override
  public String toString() {
    return "CartaoModel numeroCartao=" + numeroCartao + ", nomeCartao=" + nomeCartao
        + ", validadeCartao=" + validadeCartao + ", Cvv=" + Cvv + ", cpf=" + cpf + ", cartaoId=" + cartaoId + "]";
  }
}
