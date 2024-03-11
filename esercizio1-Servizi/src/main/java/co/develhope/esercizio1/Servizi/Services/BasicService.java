package co.develhope.esercizio1.Servizi.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
    @Autowired
    private Environment environment;

    @Value("${myCustomVarTree.customInt}")
    int customInt;
    @Value("${myCustomVarTree.customInt2}")
    int customInt2;
    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public double GetPower(){
        logger.info("This is the start of the calculation");
        double result = Math.pow(customInt,customInt2);
        logger.info("Ending of the calculation");
        return result;
    }
}
