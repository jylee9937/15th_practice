import java.io.IOException;
import java.io.*;
import java.nio.file.*;

public class Copy16 {
    public static void main(String[] args)throws IOException{
        if(args.length < 2){
            System.out.println("The arguments must be more than 1;");
            System.exit(-1);
        }

        doCopy(args);
    }
    public static void doCopy(String[] args)throws IOException{
        try(InputStreamReader inStream= new InputStreamReader(new FileInputStream("/Users/a123123/IdeaProjects/15주차_실습과제/"+args[0]))){
            int i = -1;
            while((i = inStream.read())!=-1) {

                // int to character
                char c = (char)i;

                // print char
                System.out.print(c);
            }
            if(inStream!=null) inStream.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}