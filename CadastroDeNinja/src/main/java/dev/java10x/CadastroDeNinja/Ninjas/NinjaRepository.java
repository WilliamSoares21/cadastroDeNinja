package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
