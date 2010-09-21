package no.bouvet.coolquotes;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CoolQuotesRepository {

    private List<String> storage = new ArrayList<String>();

    public CoolQuotesRepository() {
        storage.add("A dog is the only thing on earth that loves you more than you love yourself.");
        storage.add("A child of five would understand this. Send someone to fetch a child of five.");
        storage.add("A friend doesn't go on a diet because you are fat.");
        storage.add("A word to the wise ain't necessary - it's the stupid ones that need the advice.");
    }

    public String getQuote(int i){
        return storage.get(i);
    }

    public int getSize(){
        return storage.size();
    }
}
