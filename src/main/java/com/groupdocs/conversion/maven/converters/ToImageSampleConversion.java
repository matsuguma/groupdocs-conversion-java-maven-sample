package com.groupdocs.conversion.maven.converters;

import com.groupdocs.conversion.maven.domain.SampleVariables;
import com.groupdocs.conversion.converter.options.ImageSaveOptions;
import com.groupdocs.conversion.handler.ConversionHandler;
import com.groupdocs.conversion.maven.config.Config;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alex Bobkov
 */
public class ToImageSampleConversion extends SampleVariables{
    
    public ToImageSampleConversion(Config config){
        super(config);
    }
    
    /**
     * Convert 1 document page to images<br>
     * On this type of conversion convertToImage returns String with file location - path<br>
     * To use this type of conversion 'page' parameter must be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     * @param page page number
     */
    public void convertToFile(ConversionHandler conversionHandler, int page){
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions();
        imageSaveOptions.setSaveFileType(ImageSaveOptions.PNG);
        imageSaveOptions.setPage(page);
        //Optional parameters
        imageSaveOptions.setSaveName("custom_name");
        imageSaveOptions.setSavePath(config.getFileSavePath() + "1-OnePageForEachFile-IMG/");
//        imageSaveOptions.setWidth(600);
//        imageSaveOptions.setHeight(800);
        
        System.out.println("PDF");
        String savedPath = conversionHandler.convertToImage(PDF_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("WORD");
        savedPath = conversionHandler.convertToImage(DOC_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("EXCEL");
        savedPath = conversionHandler.convertToImage(EXCEL_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("POWERPOINT");
        savedPath = conversionHandler.convertToImage(PP_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("DIAGRAM");
        savedPath = conversionHandler.convertToImage(DIAGRAM_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("IMAGE");
        savedPath = conversionHandler.convertToImage(IMAGE_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("PROJECT");
        savedPath = conversionHandler.convertToImage(PROJECT_FILE, imageSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
    }
    
    /**
     * Convert 1 document page to images<br>
     * On this type of conversion convertToImage returns OutputStream with converted file<br>
     * Note: converted file is not saved in local directory<br>
     * To use this type of conversion 'page' and 'saveToStream' parameters must be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     * @param page page number
     */
    public void convertToStream(ConversionHandler conversionHandler, int page){
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions();
        imageSaveOptions.setSaveFileType(ImageSaveOptions.PNG);
        imageSaveOptions.setPage(page);
        
        OutputStream outputStream = conversionHandler.convertToImage(PDF_FILE, imageSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToImage(DOC_FILE, imageSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToImage(EXCEL_FILE, imageSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToImage(PP_FILE, imageSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToImage(DIAGRAM_FILE, imageSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToImage(IMAGE_FILE, imageSaveOptions);
        //do something with the stream

        outputStream = conversionHandler.convertToImage(PROJECT_FILE, imageSaveOptions);
        //do something with the stream
    }
    
    /**
     * Convert all document pages to images<br>
     * On this type of conversion convertToImage returns String with file location - path<br>
     * To use this type of conversion 'page' parameter should NOT be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     */
    public void convertToFiles(ConversionHandler conversionHandler){
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions();
        imageSaveOptions.setSaveFileType(ImageSaveOptions.PNG);
        //Optional parameters
        imageSaveOptions.setSaveName("custom_name");
        imageSaveOptions.setSavePath(config.getFileSavePath() + "2-AllPagesFromEachFiles-IMG/");
//        imageSaveOptions.setWidth(600);
//        imageSaveOptions.setHeight(800);
        
        System.out.println("PDF (page_size=" + conversionHandler.getPageCount(PDF_FILE) + ")");
        ArrayList<String> list = conversionHandler.convertToImage(PDF_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("WORD (page_size=" + conversionHandler.getPageCount(DOC_FILE) + ")");
        list = conversionHandler.convertToImage(DOC_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("EXCEL (page_size=" + conversionHandler.getPageCount(EXCEL_FILE) + ")");
        list = conversionHandler.convertToImage(EXCEL_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("POWERPOINT (page_size=" + conversionHandler.getPageCount(PP_FILE) + ")");
        list = conversionHandler.convertToImage(PP_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("DIAGRAM (page_size=" + conversionHandler.getPageCount(DIAGRAM_FILE) + ")");
        list = conversionHandler.convertToImage(DIAGRAM_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("IMAGE (page_size=" + conversionHandler.getPageCount(IMAGE_FILE) + ")");
        list = conversionHandler.convertToImage(IMAGE_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("PROJECT (page_size=" + conversionHandler.getPageCount(PROJECT_FILE) + ")");
        list = conversionHandler.convertToImage(PROJECT_FILE, imageSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
    }
    
    /**
     * Convert all document pages to images<br>
     * On this type of conversion convertToImage returns OutputStream with converted file<br>
     * Note: converted file is not saved in local directory<br>
     * To use this type of conversion 'saveToStream' parameters must be set and 'page' parameter should NOT be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     */
    public void convertToListStreams(ConversionHandler conversionHandler){
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions();
        imageSaveOptions.setSaveFileType(ImageSaveOptions.PNG);
        
        ArrayList<OutputStream> list = conversionHandler.convertToImage(PDF_FILE, imageSaveOptions);
        int i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToImage(DOC_FILE, imageSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToImage(EXCEL_FILE, imageSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToImage(PP_FILE, imageSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
    }
}
