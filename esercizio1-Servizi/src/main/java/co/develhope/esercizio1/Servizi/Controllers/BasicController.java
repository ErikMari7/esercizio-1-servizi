package co.develhope.esercizio1.Servizi.Controllers;

import co.develhope.esercizio1.Servizi.Services.BasicService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicController {
    @Autowired
    private BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String getMessage(){
        logger.info("This is a welcome message");
        return "Welcome!";
    }
    @GetMapping("/exp")
    public double getPower(){
        return basicService.GetPower();
    }
    @GetMapping("/get-errors")
    public void error(){
        Error error= new Error("This is the error");
        logger.error("This is the error logging", error);
    }

}
