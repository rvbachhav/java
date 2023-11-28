package java_Slips;
import java.io.*;
import java.util.*;

public class slip13_q1 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Invalid");
        }

        String filename = args[0];

        try{
            FileReader fileR = new FileReader(filename);
            BufferedReader br = new BufferedReader(fileR);
            int wordCount=0;
            int lineCount=0;

            String lines;
            while((lines = br.readLine()) != null){
                String[] words = lines.split("\\s+");
                wordCount += words.length;
                lineCount++;
            }
            br.close();

            System.out.println("Total Words -> " + wordCount);
            System.out.println("Total Lines -> " + lineCount);
        }catch(Exception e){
            System.out.println("opps something went wrong");
            e.printStackTrace();
        }
    }
}
