package Main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Launch {

    private File file;

    public void start(){

        String filePath = "text.txt";
        file = new File(filePath);

        try {
            firstLast(readFile(file));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void firstLast(String str){

        String[] mass = str.split(" ");

        for (int i = 0; i < mass.length - 1; i++){
            if (mass[i].charAt(mass[i].length()-1) == mass[i+1].charAt(0))
                System.out.println(mass[i] + " " + mass[i + 1]);

        }

    }

    /**
     * Считывает текст из файле и возвращает строку с текстом
     * @param file - файл, в котором будем считывать текст
     * @return - текст из файла
     */
    private String readFile(File file) {
        String textFile = "";
        try {
            FileReader reader = new FileReader(file);
            textFile = "";
            int c;
            while ((c = reader.read()) != -1) {
                textFile += (char) c;
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return textFile;
    }
}
