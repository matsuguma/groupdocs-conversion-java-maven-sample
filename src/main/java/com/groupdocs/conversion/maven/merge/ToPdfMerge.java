package com.groupdocs.conversion.maven.merge;

import com.groupdocs.conversion.handler.ConversionHandler;
import com.groupdocs.conversion.maven.config.Config;
import com.groupdocs.conversion.maven.domain.SampleVariables;
import com.groupdocs.conversion.merge.options.MergeOptions;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alex Bobkov
 */
public class ToPdfMerge extends SampleVariables{

    public ToPdfMerge(Config config){
        super(config);
    }
    
    public void mergeToFile(ConversionHandler conversionHandler) throws Exception{
        //Create and set options object
        MergeOptions options = new MergeOptions();
        options.setSaveFileType(MergeOptions.PDF);
        options.setSaveName("custom_name");
        options.setSavePath(config.getFileSavePath() + "6-Merge-PDF/");
        //Create list of file to merge
        ArrayList<String> filePathList = new ArrayList<String>();
        filePathList.add(PDF_FILE);
        filePathList.add(DOC_FILE);
        //Merge documents
        String savedPath = conversionHandler.merge(filePathList, options);
        //Print result document path
        System.out.println(savedPath);
        System.out.println("");
    }
    
    public void mergeToStream(ConversionHandler conversionHandler) throws Exception{
        MergeOptions options = new MergeOptions();
        options.setSaveFileType(MergeOptions.PDF);
        ArrayList<String> filePathList = new ArrayList<String>();
        filePathList.add(PDF_FILE);
        filePathList.add(DOC_FILE);
        OutputStream out = conversionHandler.merge(filePathList, options);
    }
}
