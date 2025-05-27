package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

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
}
