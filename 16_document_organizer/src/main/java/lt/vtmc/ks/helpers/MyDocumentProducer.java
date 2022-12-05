package lt.vtmc.ks.helpers;

import lt.itakademija.Document;
import lt.itakademija.DocumentProducer;
import java.util.Iterator;
/**
 * Helper klasė, extract'ina "Document" iš iteratoriaus.
 *
 * @author KS
 *
 */
public class MyDocumentProducer implements DocumentProducer {
   Iterator<Document> iterator;
    public MyDocumentProducer(Iterator <Document>iterator) {
        this.iterator = iterator;
   }

    @Override
    public Document get() {

        while(iterator.hasNext()){
           return iterator.next();
        }
        return null;
    }
}
