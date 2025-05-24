package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Ele transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro_de_ninjas")
@NoArgsConstructor // Gera um construtor sem argumentos (No-arg constructor) automaticamente
// O @NoArgsConstructor é útil para frameworks como Hibernate, que precisam de um construtor padrão para criar instâncias da classe
// sem precisar de argumentos. Isso é especialmente importante em operações de persistência, onde o Hibernate pode precisar instanciar a classe antes de preencher os campos.
@AllArgsConstructor // Gera um construtor com todos os argumentos (Args constructor) automaticamente
// O @AllArgsConstructor é útil para criar instâncias da classe com todos os campos preenchidos de uma só vez.
// Isso é útil para inicializar objetos com todos os dados necessários em uma única chamada de construtor.
// Isso é especialmente útil em testes ou quando você tem certeza de que todos os campos devem ser preenchidos ao criar a instância.
@Data // Gera automaticamente os métodos getters, setters, equals, hashCode e toString para a classe
// O @Data é uma anotação do Lombok que reduz a quantidade de código boilerplate necessário para criar classes Java.
// Ele gera automaticamente os métodos getters e setters para todos os campos, além de equals, hashCode e toString.
// Isso torna o código mais limpo e fácil de ler, além de reduzir a quantidade de código que você precisa escrever manualmente.
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private int idade;
  
  @ManyToOne // Indica que um ninja pode ter várias missões, mas uma missão pertence a um ninja
  @JoinColumn(name = "missoes_id") // Define a coluna que referencia a missão na tabela de ninjas
  // mappedBy não é necessário aqui, pois estamos definindo a relação do lado do ninja
  // Isso significa que a tabela de ninjas terá uma coluna que referencia a missão
  // Isso é útil para evitar redundância e manter a integridade referencial no banco de dados
  private MissoesModel missoes;
}
