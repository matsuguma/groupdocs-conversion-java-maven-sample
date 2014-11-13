package com.groupdocs.conversion.maven.config;

import com.groupdocs.conversion.config.ConversionConfig;

/**
 *
 * @author Alex Bobkov
 */
public class Config implements ConversionConfig{
    private final String licensePath1 = null;
    private final String licensePath2 = "";
    private final String licensePath3 = "D:/Projects/GroupDocs/Apps/0-resources/licenses/aspose.total/Aspose.Total.Java.2014.lic";
    private final String licensePath4 = "D:/Projects/GroupDocs/Apps/0-resources/licenses/groupdocs.conversion/GroupDocs.Conversion.for.Java.lic";
    private final String savePath = "D:/Projects/GroupDocs/Apps/xFiles/converted/";

    public String getLicensePath() {
        return licensePath1;
    }

    public String getStoragePath() {
        return System.getProperty("user.dir") + "/file_samples";
    }

    public String getFileSavePath() {
        return savePath;
    }

}
