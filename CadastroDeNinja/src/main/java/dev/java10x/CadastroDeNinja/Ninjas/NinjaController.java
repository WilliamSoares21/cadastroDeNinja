package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas") // aqui é onde defino um caminho base para todos os endpoints de ninja
public class NinjaController {

  @Autowired
  private NinjaService ninjaService;// aqui o spring vai injetar uma instância de NinjaService

  @GetMapping("/boasvindas")
  public String boasVindas() {
    return "Boas Vindas a área de Ninjas";
  }

  public ResponseEntity<NinjaModel> cadastrarNinja(@RequestBody NinjaModel ninja) {
    NinjaModel novoNinja = ninjaService.cadastrarNinja(ninja);
    return new ResponseEntity<>(novoNinja, HttpStatus.CREATED);
  }

}
