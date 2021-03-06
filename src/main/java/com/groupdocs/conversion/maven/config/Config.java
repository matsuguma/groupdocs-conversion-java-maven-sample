package com.groupdocs.conversion.maven.config;

import com.groupdocs.conversion.config.IConfig;

/**
 *
 * @author Alex Bobkov
 */
public class Config implements IConfig{
    private final String licensePath = null;
    private final String savePath = "D:/Projects/GroupDocs/Apps/xFiles/converted/";

    public String getLicensePath() {
        return licensePath;
    }

    public String getStoragePath() {
        return System.getProperty("user.dir") + "/file_samples";
    }

    public String getFileSavePath() {
        return savePath;
    }

}
