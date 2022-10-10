package br.com.contasapagar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa notação diz que essa classe é uma Controller ou seja está dizendo que essa é uma aplicação REST
public class StatusController {

    // Vou criar um método pra saber se o servidor da aplicação está online

    @GetMapping(path = "/api/status") // GetMapping diz que esse método é um endpoint
    public String check(){

        return "Está Online!";
    }

}
