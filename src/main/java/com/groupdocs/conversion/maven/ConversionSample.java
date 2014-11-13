package com.groupdocs.conversion.maven;

import com.groupdocs.conversion.handler.ConversionHandler;
import com.groupdocs.conversion.maven.config.Config;
import com.groupdocs.conversion.maven.converters.ToImageSampleConversion;
import com.groupdocs.conversion.maven.converters.ToPdfSampleConversion;

/**
 *
 * @author Alex Bobkov
 */
public class ConversionSample {
    

    public static void main(String[] args) {
        Config config = new Config();
        ConversionHandler conversionHandler = new ConversionHandler(config);
        
        ToImageSampleConversion toImage = new ToImageSampleConversion(config);
        toImage.convertToFile(conversionHandler, 1);
        toImage.convertToFiles(conversionHandler);
//        toImage.convertToStream(conversionHandler, 1);
//        toImage.convertToListStreams(conversionHandler);
                
        ToPdfSampleConversion toPdf = new ToPdfSampleConversion(config);
        toPdf.convertToFile(conversionHandler, 1);
        toPdf.convertToFile(conversionHandler);
        toPdf.convertToFiles(conversionHandler);
//        toPdf.convertToStream(conversionHandler, 1);
//        toPdf.convertToListStreams(conversionHandler);
        
    }
    
}
