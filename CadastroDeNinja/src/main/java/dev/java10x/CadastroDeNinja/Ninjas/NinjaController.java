package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaModel buscarNinjaPorId(@PathVariable Long id) {
        return ninjaService.buscarNinjaPorId(id).orElse(null);
    }

    @PostMapping
    public NinjaModel cadastrarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.cadastrarNinja(ninja);
    }

    @DeleteMapping("/{id}")
    public void excluirNinja(@PathVariable Long id) {
        ninjaService.excluirNinja(id);
    }
}
