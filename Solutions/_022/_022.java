package Solutions._022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _022 {


    public static void main(String[] args){

        String cleanText = "";
        File file = new File("/Users/mahirahmed/project-euler/Solutions/_022/p022_names.txt");
        try {
            Scanner sc = new Scanner(file);
            String input = sc.nextLine();
            String[] names = input.split(",");


            for (String name: names){
                 cleanText += "\n" + name.replace("\"", "");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
