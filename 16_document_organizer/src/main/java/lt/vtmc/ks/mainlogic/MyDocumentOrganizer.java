package lt.vtmc.ks.mainlogic;

import lt.itakademija.*;
/**
 * Pagrindinė klasė, atlieka veiksmus pagal gautą failo tipą.
 *
 * @author KS
 *
 */
public class MyDocumentOrganizer implements DocumentOrganizer {
    /**
     *Saugo bendrą, apdorotų eilučių skaičių.
     */
    private long totalLines = 0;
    /**
     *Saugo bendrą, apdorotų documentų skaičių.
     */
    private int totalDocuments = 0;
   private DocumentTypeDetector documentTypeDetector;

    public MyDocumentOrganizer(DocumentTypeDetector documentTypeDetector){
        this.documentTypeDetector = documentTypeDetector;
    }
    /**
     * Grąžina bendrą, apdorotų dokumentų skaičių.
     * @param @void
     * @return int
     */
    @Override
    public long getTotalCount() {

        return this.totalDocuments;
    }
    /**
     * Grąžina bendrą, apdorotų eilučių skaičių.
     * @param @void
     * @return long
     */
    @Override
    public long getTotalLinesCount() {

        return this.totalLines;
    }
    /**
     * Vykdo objektų nukreipimą, tikriną kintamųjų validumą.
     * @param DocumentProducer documentProducer
     * @param DocumentConsumer documentConsumer
     * @return long
     */
    @Override
    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {

        if(documentProducer == null || documentConsumer == null) {
           throw new IllegalArgumentException();
       }

        DocumentType documentType;
        Document tempDocument = documentProducer.get();

        while (tempDocument !=null){
            documentType = documentTypeDetector.detect(tempDocument);

            if(documentType.equals(DocumentType.UNKNOWN)){
                throw new UnknownDocumentTypeException(tempDocument.getTitle());
            }
            totalDocuments += 1;
            totalLines += tempDocument.getLines().size();

        switch (documentType){
            case SPAM:
                documentConsumer.consumeSpam(tempDocument);
                break;
            case ORDINARY:
                documentConsumer.consumeOrdinary(tempDocument);
                break;
            case IMPORTANT:
                documentConsumer.consumeImportant(tempDocument);
                break;
            case UNKNOWN:

            default:
                throw new UnknownDocumentTypeException("This document " + tempDocument.getTitle() +
                        ", type "+ documentType +
                        " shouldn't reach this point!!!");
        }
            tempDocument = documentProducer.get();
       }
    }
}
