package org.qualipso.factory.core.parser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.util.PDFTextStripper;
import org.qualipso.factory.core.CoreServiceException;
import org.qualipso.factory.core.entity.FileData;

/**
 * Class which can parse the file type PDF. If the pdf is protected by password, We can't read <br/>
 * @author FLORENTIN Cynthia
 * @author CLAUDOT Anthony
 */
public class PDFContentParser implements FileContentParser{
    
    @Override
    public String parse(FileData fileData) throws CoreServiceException {
        StringBuffer buffer = new StringBuffer();
        PDDocument pdfDocument = null;

        try {
            PDFParser parser = new PDFParser(fileData.getInputStream());
            parser.parse();

            pdfDocument = parser.getPDDocument();

            //create a tmp output stream with the size of the content.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(out);
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.writeText(pdfDocument, writer);
            writer.close();

            buffer.append(new String(out.toByteArray()));

            PDDocumentInformation info = pdfDocument.getDocumentInformation();

            if (info.getAuthor() != null) {
                buffer.append(info.getAuthor() + " ");
            }

            if (info.getCreator() != null) {
                buffer.append(info.getCreator() + " ");
            }

            if (info.getKeywords() != null) {
                buffer.append(info.getKeywords() + " ");
            }

            if (info.getProducer() != null) {
                buffer.append(info.getProducer() + " ");
            }

            if (info.getSubject() != null) {
                buffer.append(info.getSubject() + " ");
            }

            if (info.getTitle() != null) {
                buffer.append(info.getTitle() + " ");
            }

            if (info.getTrapped() != null) {
                buffer.append(info.getTrapped() + " ");
            }

            pdfDocument.close();
        } catch (IOException ioe) {
            logger.error("unable to open file", ioe);
            throw new CoreServiceException("unable to open file at name: " + fileData.getData().getName(), ioe);
        } 

        return buffer.toString();
    }

}
