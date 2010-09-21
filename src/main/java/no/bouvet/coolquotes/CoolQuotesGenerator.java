package no.bouvet.coolquotes;

import org.springframework.stereotype.Service;

@Service("coolQuotesGenerator")
public class CoolQuotesGenerator implements CoolQuotes{

    public String getRandomQuote(){
        return "";
    }
}
