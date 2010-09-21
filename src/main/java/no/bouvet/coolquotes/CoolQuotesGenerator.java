package no.bouvet.coolquotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("coolQuotesGenerator")
public class CoolQuotesGenerator implements CoolQuotes{

    @Autowired
    private CoolQuotesRepository repository;

    private Random generator = new Random();

    public String getRandomQuote(){
        return repository.getQuote(generator.nextInt(repository.getSize()));
    }
}
