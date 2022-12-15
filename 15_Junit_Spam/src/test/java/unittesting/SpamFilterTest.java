package unittesting;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

public class SpamFilterTest {

    @BeforeEach
    void init(){
        SpamFilter spamFilter = new SpamFilter(new DictionarySpamFilterPolicy(new SpamFilter()));
    }
}
