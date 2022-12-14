package com.mkyong.two;
import com.mkyong.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Simple {
    private static final Logger logger = LoggerFactory.getLogger(Simple.class);
    public Simple() {
        logger.debug("Hello from descendant class");
    }

    public void show(){
        logger.info("Hello from descendant class");
    }
}
