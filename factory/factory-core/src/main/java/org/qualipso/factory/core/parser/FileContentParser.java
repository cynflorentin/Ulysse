package org.qualipso.factory.core.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.qualipso.factory.core.CoreServiceBean;
import org.qualipso.factory.core.CoreServiceException;
import org.qualipso.factory.core.entity.FileData;
/**
 * <p>
 * Interface which allows to parse different type of file 
 * in function to their mime's type. 
 * @author FLORENTIN Cynthia
 * @author CLAUDOT Anthony
 * </p>
 */
public interface FileContentParser {
    
    public static Log logger = LogFactory.getLog(CoreServiceBean.class);
    
    /**
     * Parse the fileData to text, which will can to be transform in IndexableContent 
     * @param fileData 
     *          contains only data
     * @return the contains of fileData like a String
     */
    public String parse(FileData fileData)throws CoreServiceException;
}
