package dev.java10x.CadastroDeNinja;

public class NinjaModel {

  Long id;
  String nome;
  String email;
  int idade;

  /**
   * Construtor sem argumentos (No-arg).
   * Cria um NinjaModel com valores padrão (ou nulos/zeros).
   * Útil para criar objetos e definir valores depois.
   */
  public NinjaModel() {
    // Inicialização padrão pode ser feita aqui.
  }

  /**
   * Construtor com argumentos (Args).
   * Cria um NinjaModel com nome, email e idade especificados.
   * Garante que o objeto seja criado com dados iniciais.
   * 
   * @param nome  Nome do ninja.
   * @param email Email do ninja.
   * @param idade Idade do ninja.
   */
  public NinjaModel(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
