package com.snapdeal.snapdealapp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void Capture(WebDriver driver) throws IOException{
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("./Screenshot/"+timestamp()+" "+".png"));

        }

    

    public static String timestamp() {

        return new SimpleDateFormat("yyyy-MM-DD hh-mm-ss").format(new Date());

    }
	}



