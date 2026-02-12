package utils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;


public class ScreenshotUtil {


 public static void capture(WebDriver driver, String name) {
        try {
            // Create folder if not exists
            Path screenshotDir = Path.of("target/screenshots");
            if (!Files.exists(screenshotDir)) {
                Files.createDirectories(screenshotDir);
            }

            // Take screenshot
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path dest = screenshotDir.resolve(name.replaceAll(" ", "_") + ".png");

            Files.copy(src.toPath(), dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}