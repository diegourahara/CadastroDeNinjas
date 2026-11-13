package farias.diego.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninja";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Deletar Ninja por ID";
    }

}