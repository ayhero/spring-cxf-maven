package no.bouvet.coolquotes;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CoolQuotes {

    @WebMethod
    public String getRandomQuote();
}
