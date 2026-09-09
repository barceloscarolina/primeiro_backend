package cbarcelos.backend;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/biblioteca")
public class exemploController {
 @GetMapping("/")
 public String getMensagemInicial() {
 return "Aplicacao Spring-Boot funcionando!";
 }

 @GetMapping("/livros")
 public String getLivros() {
 return "Endpoint de livros...";
 }

}