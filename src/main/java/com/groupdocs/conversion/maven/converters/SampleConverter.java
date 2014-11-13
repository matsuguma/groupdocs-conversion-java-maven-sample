package com.groupdocs.conversion.maven.converters;

import com.groupdocs.conversion.maven.config.Config;

/**
 *
 * @author Alex Bobkov
 */
public abstract class SampleConverter {
    protected final String PDF_FILE = "GroupDocs_Demo.pdf";
    protected final String DOC_FILE = "GroupDocs_Demo.doc";
    protected final String EXCEL_FILE = "GroupDocs_Demo.xls";
    protected final String PP_FILE = "GroupDocs_Demo.ppt";
    protected final String DIAGRAM_FILE = "GroupDocs_Demo.vdx";
    protected final String IMAGE_FILE = "GroupDocs_Demo.jpg";
    protected final String PROJECT_FILE = "GroupDocs_Demo.mpp";
    protected final Config config;
    
    public SampleConverter(Config config){
        this.config = config;
    }
}
