package com.groupdocs.conversion.maven.converters;

import com.groupdocs.conversion.maven.domain.SampleVariables;
import com.groupdocs.conversion.converter.options.PdfSaveOptions;
import com.groupdocs.conversion.domain.WordBookmarks;
import com.groupdocs.conversion.handler.ConversionHandler;
import com.groupdocs.conversion.maven.config.Config;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alex Bobkov
 */
public class ToPdfSampleConversion extends SampleVariables{

    public ToPdfSampleConversion(Config config) {
        super(config);
    }

    /**
     * Convert 1 document page to pdf<br>
     * On this type of conversion convertToImage returns String with file location - path<br>
     * To use this type of conversion 'page' parameter must be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     * @param page
     */
    public void convertToFile(ConversionHandler conversionHandler, int page){
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setPage(page);
        //Optional parameters
        pdfSaveOptions.setSaveName("custom_name");
        pdfSaveOptions.setSavePath(config.getFileSavePath() + "3-OnePageFromEachFile-PDF/");
        
        System.out.println("PDF");
        String savedPath = conversionHandler.convertToPdf(PDF_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("WORD");
        savedPath = conversionHandler.convertToPdf(DOC_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("EXCEL");
        savedPath = conversionHandler.convertToPdf(EXCEL_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("POWERPOINT");
        savedPath = conversionHandler.convertToPdf(PPT_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("DIAGRAM");
        savedPath = conversionHandler.convertToPdf(DIAGRAM_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("IMAGE");
        savedPath = conversionHandler.convertToPdf(IMAGE_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("PROJECT");
        savedPath = conversionHandler.convertToPdf(PROJECT_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
    }
    
    /**
     * Convert whole document to pdf<br>
     * On this type of conversion convertToImage returns String with file location - path<br>
     * To use this type of conversion 'page' parameter must be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     */
    public void convertToFile(ConversionHandler conversionHandler){
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        //Optional parameters
        pdfSaveOptions.setSaveName("custom_name");
        pdfSaveOptions.setSavePath(config.getFileSavePath() + "4-WholeFileConversion-PDF/");
        //Create bookmarks from Word documents
        pdfSaveOptions.setWordBookmarks(WordBookmarks.HEADINGS);
        
        System.out.println("PDF");
        String savedPath = conversionHandler.convertToPdf(PDF_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("WORD");
        savedPath = conversionHandler.convertToPdf(DOC_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("EXCEL");
        savedPath = conversionHandler.convertToPdf(EXCEL_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("POWERPOINT");
        savedPath = conversionHandler.convertToPdf(PPT_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("DIAGRAM");
        savedPath = conversionHandler.convertToPdf(DIAGRAM_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("IMAGE");
        savedPath = conversionHandler.convertToPdf(IMAGE_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
        
        System.out.println("PROJECT");
        savedPath = conversionHandler.convertToPdf(PROJECT_FILE, pdfSaveOptions);
        System.out.println(savedPath);
        System.out.println("");
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
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setSplitIntoPages(true);
        //Optional parameters
        pdfSaveOptions.setSaveName("custom_name");
        pdfSaveOptions.setSavePath(config.getFileSavePath() + "5-AllPagesFromEachFiles-PDF/");

        
        System.out.println("PDF (page_size=" + conversionHandler.getPageCount(PDF_FILE) + ")");
        ArrayList<String> list = conversionHandler.convertToPdf(PDF_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("WORD (page_size=" + conversionHandler.getPageCount(DOC_FILE) + ")");
        list = conversionHandler.convertToPdf(DOC_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("EXCEL (page_size=" + conversionHandler.getPageCount(EXCEL_FILE) + ")");
        list = conversionHandler.convertToPdf(EXCEL_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("POWERPOINT (page_size=" + conversionHandler.getPageCount(PPT_FILE) + ")");
        list = conversionHandler.convertToPdf(PPT_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("DIAGRAM (page_size=" + conversionHandler.getPageCount(DIAGRAM_FILE) + ")");
        list = conversionHandler.convertToPdf(DIAGRAM_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("IMAGE (page_size=" + conversionHandler.getPageCount(IMAGE_FILE) + ")");
        list = conversionHandler.convertToPdf(IMAGE_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
        
        System.out.println("PROJECT (page_size=" + conversionHandler.getPageCount(PROJECT_FILE) + ")");
        list = conversionHandler.convertToPdf(PROJECT_FILE, pdfSaveOptions);
        for(String item : list){
            System.out.println(item);
        }
        System.out.println();
    }
    
    /**
     * 
     * @param conversionHandler
     * @param page 
     */
    public void convertToStream(ConversionHandler conversionHandler, int page){
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setPage(page);
        
        OutputStream outputStream = conversionHandler.convertToPdf(PDF_FILE, pdfSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToPdf(DOC_FILE, pdfSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToPdf(EXCEL_FILE, pdfSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToPdf(PPT_FILE, pdfSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToPdf(DIAGRAM_FILE, pdfSaveOptions);
        //do something with the stream
        
        outputStream = conversionHandler.convertToPdf(IMAGE_FILE, pdfSaveOptions);
        //do something with the stream

        outputStream = conversionHandler.convertToPdf(PROJECT_FILE, pdfSaveOptions);
        //do something with the stream
    }
    
    /**
     * Convert all document pages to pdf<br>
     * On this type of conversion convertToImage returns OutputStream with converted file<br>
     * Note: converted file is not saved in local directory<br>
     * To use this type of conversion 'saveToStream' parameters must be set and 'page' parameter should NOT be set in ImageSaveOptions<br>
     * convertToImage method also can receive InputStream as parameter<br>
     * See JavaDoc for more info.<br>
     * @param conversionHandler ConversionHandler instance
     */
    public void convertToListStreams(ConversionHandler conversionHandler){
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        
        ArrayList<OutputStream> list = conversionHandler.convertToPdf(PDF_FILE, pdfSaveOptions);
        int i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToPdf(DOC_FILE, pdfSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToPdf(EXCEL_FILE, pdfSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
        
        list = conversionHandler.convertToPdf(PPT_FILE, pdfSaveOptions);
        i = 0;
        for(OutputStream item : list){
            System.out.println("item " + i++);
        }
    }
}
