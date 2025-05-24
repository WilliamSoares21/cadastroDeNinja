package dev.java10x.CadastroDeNinja.Missoes;

import java.util.List;

import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;


    @OneToMany(mappedBy = "missoes") // Indica que uma missão pode ter vários ninjas associados a ela
    // mappedBy indica que a relação é gerenciada pela entidade NinjaModel
    // Isso significa que a tabela de missões não terá uma coluna para o ID do ninja, mas sim a tabela de ninjas terá uma coluna que referencia a missão
    // Isso é útil para evitar redundância e manter a integridade referencial no banco de dados
    // Um ninja pode ter várias missões, mas uma missão pertence a um ninja
    private List<NinjaModel> ninjas; // Isso cria uma relação entre as entidades MissoesModel e NinjaModel

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    
}
