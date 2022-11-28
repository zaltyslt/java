package lt.vtmc.ks.test;

import lt.itakademija.*;
import lt.vtmc.ks.helpers.MyDocumentConsumer;
import lt.vtmc.ks.mainlogic.MyDocumentOrganizer;
import lt.vtmc.ks.helpers.MyDocumentProducer;

import java.util.Iterator;
/**
 * Testinė klasė, nurodanti, kurias klases testuoti.
 *
 * @author KS
 *
 */
public class MyBaseTest extends BaseTest {
    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return new MyDocumentOrganizer(documentTypeDetector);
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        return new MyDocumentProducer(iterator);
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return new MyDocumentConsumer(fileRepository);
    }
}
