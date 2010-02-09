package org.qualipso.factory.core.parser;

import java.util.Hashtable;

/**
 * Class which associate a mime's type to a class of type FileContentParser
 * @author FLORENTIN Cynthia
 * @author CLAUDOT Anthony
 *
 */
public class TypesParser {
    private static Hashtable<String,String> repository = new Hashtable<String,String>();

    static {
        repository.put("text/xml", "org.qualipso.factory.core.parser.XMLContentParser");
        repository.put("text/plain", "org.qualipso.factory.core.parser.TEXTContentParser");
        repository.put("application/pdf", "org.qualipso.factory.core.parser.PDFContentParser");
        repository.put("application/vnd.ms-word", "org.qualipso.factory.core.parser.WORDContentParser");
        repository.put("application/vnd.ms-excel", "org.qualipso.factory.core.parser.EXCELContentParser");
        repository.put("application/vnd.ms-powerpoint", "org.qualipso.factory.core.parser.PPTContentParser");
        repository.put("application/vnd.sun.xml.writer", "org.qualipso.factory.core.parser.OOOContentParser");
        repository.put("application/vnd.sun.xml.calc", "org.qualipso.factory.core.parser.OOOContentParser");
        repository.put("application/vnd.sun.xml.impress", "org.qualipso.factory.core.parser.OOOContentParser");
    }
    
    /**
     * Method which associate a class with a mime's type.
     * @param mimeType
     * @return a class which implement FileContentParser
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public static FileContentParser getParser(String mimeType) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
        String classe = (String) repository.get(mimeType);

        if (classe == null) {
            return null;
        }

        return (FileContentParser) Class.forName(classe).newInstance();
    }
}
