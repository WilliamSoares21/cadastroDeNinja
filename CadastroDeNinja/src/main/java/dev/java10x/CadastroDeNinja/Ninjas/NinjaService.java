package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class NinjaService {

  @Autowired
  private NinjaRepository ninjaRepository;

  public NinjaModel cadastrarNinja(NinjaModel ninja) {
    return ninjaRepository.save(ninja);
  }

  public Optional<NinjaModel> buscarNinjaPorId(Long id) {
    return ninjaRepository.findById(id);
  }

  public List<NinjaModel> listarNinjas() {
    return ninjaRepository.findAll();
  }

  public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
    Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
    if (ninjaExistente.isPresent()) {
      NinjaModel ninja = ninjaExistente.get();
      ninja.setNome(ninjaAtualizado.getNome());
      ninja.setEmail(ninjaAtualizado.getEmail());
      ninja.setIdade(ninjaAtualizado.getIdade());
      ninja.setMissoes(ninjaAtualizado.getMissoes());
      return ninjaRepository.save(ninja);
    }
    return null;

  }

  public void excluirNinja(Long id) {
    ninjaRepository.deleteById(id);
  }

}
