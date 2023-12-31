package jrdev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //notation que reconhece a classe com a classe inicial
@RestController
public class VendasApplication {
    //testando Bean
    //Fzendo injeção
    @Autowired
    @Qualifier("testeName")
    private String credentials;
    //mapeia requisições da URL
    @GetMapping("/hello")
    public String HelloWorld (){
        return "Olá pessoal!";
    }
    @GetMapping("")
    public String starter (){
        return "API Rodando!!"+this.credentials;
    }
    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class,args);
    }
}
