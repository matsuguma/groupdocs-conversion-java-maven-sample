package com.groupdocs.conversion.maven.merge;

import com.groupdocs.conversion.handler.ConversionHandler;
import com.groupdocs.conversion.maven.config.Config;
import com.groupdocs.conversion.maven.domain.SampleVariables;
import com.groupdocs.conversion.merge.options.MergeOptions;
import java.util.ArrayList;

/**
 *
 * @author Alex Bobkov
 */
public class ToPdfMerge extends SampleVariables{

    public ToPdfMerge(Config config){
        super(config);
    }
    
    public void mergeToFile(ConversionHandler conversionHandler){
        MergeOptions options = new MergeOptions();
        options.setSaveFileType(MergeOptions.PDF);
        options.setSaveName("custom_name");
        options.setSavePath(config.getFileSavePath() + "6-Merge-PDF/");
        ArrayList<String> filePathList = new ArrayList<String>();
        filePathList.add(PDF_FILE);
        filePathList.add(DOC_FILE);
        System.out.println("PDF");
        String savedPath = conversionHandler.merge(filePathList, options);
        System.out.println(savedPath);
        System.out.println("");
    }
    
    public void mergeToStream(ConversionHandler conversionHandler){
        
    }
}
