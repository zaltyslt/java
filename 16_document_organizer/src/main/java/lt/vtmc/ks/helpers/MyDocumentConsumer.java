package lt.vtmc.ks.helpers;

import lt.itakademija.*;
/**
 * Helper klasė, atlieka veiksmus pagal gautą failo tipą.
 *
 * @author KS
 *
 */
public class MyDocumentConsumer implements DocumentConsumer {
    FileRepository fileRepository;

    public MyDocumentConsumer(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }
    @Override
    public void consumeSpam(Document document) {
        fileRepository.putSpam(document);
    }
    @Override
    public void consumeImportant(Document document) {
        fileRepository.putImportant(document);
    }
    @Override
    public void consumeOrdinary(Document document) {
        fileRepository.putOrdinary(document);
    }
}
