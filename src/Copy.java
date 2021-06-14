import java.io.IOException;
import java.io.*;
import java.nio.file.*;

public class Copy {
    public static void main(String[] args)throws IOException{
        if(args.length < 2){
            System.out.println("The arguments must be more than 1;");
            System.exit(-1);
        }

        doCopy(args);
    }
    public static void doCopy(String[] args)throws IOException{
        Path inputPath = Paths.get("/Users/a123123/IdeaProjects/15주차_실습과제/"+args[0]); //첫번째 인자로 받은 파일명의 경로 수집
        Path outputPath = Paths.get("/Users/a123123/IdeaProjects/15주차_실습과제/"+args[1]); // 두번째 인자로 받은 파일명의 경로 수집

        OutputStream out = Files.newOutputStream(outputPath);
        try(InputStream in = Files.newInputStream(inputPath)){
            int count=0;
            while(true) {
                int dataInteger = in.read();
                byte dataByte;
                if(dataInteger == -1) {
                    System.out.println("Count = " + count);
                    break;
                }
                count++;
                dataByte = (byte)dataInteger;
                out.write(dataByte);            // 한 바이트씩 쓴다.
            }
            in.close();                        // 닫아주기
            out.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
