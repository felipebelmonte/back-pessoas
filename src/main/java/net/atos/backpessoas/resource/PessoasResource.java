package net.atos.backpessoas.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoasResource {

    @RequestMapping(value = "/pessoas", method = RequestMethod.POST)
    public ResponseEntity<?> pessoas(@RequestBody String js) {
        if (js != null) {
            System.out.println(js);
            String response = "Enviado com Sucesso!";
        return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

}
