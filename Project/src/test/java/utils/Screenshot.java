package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

/*
 * Author: Kotha Sai Ragunath
 * Method Name: takeScreenshot
 * Description: This static method captures a screenshot of the current browser state, appending a timestamp to the file name, and saves it in a designated "screenshots" directory.
 * Parameters: String fileName - Base name for the screenshot file.
 * Return Type: void
 */

public class Screenshot extends Base{

    public static TakesScreenshot takesScreenshot;

    public static void takeScreenshot(String fileName){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String newFileName = fileName +"_"+ timeStamp +".png";
        takesScreenshot = (TakesScreenshot) driver;
        
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File screenshotsDirectory = new File(System.getProperty("user.dir")+ "/screenshots");
        if(!screenshotsDirectory .exists()){
            screenshotsDirectory.mkdirs();
        }

        File targetFile = new File(screenshotsDirectory,newFileName);
        try{
            Files.copy(sourceFile,targetFile);
        }catch(IOException e){
            e.printStackTrace();
            
        }
    }

}
