package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    /**
     * метод логирования
     * @param line строка для логирования
     */

    public void log(String line) {
        System.out.print(line);
        writeToFile(line);
    }      

    public static void writeToFile(String str) {
        File file = new File("toys_out.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(str);
                fileWriter.write("\n");
            }
        catch (IOException ex) {
            System.out.println("ERROR");
        }
    }    
}
