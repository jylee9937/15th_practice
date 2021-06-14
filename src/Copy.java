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
        int i;
        Path inputPath = Paths.get("/Users/a123123/IdeaProjects/15주차_실습과제/out/production/15주차_실습과제/"+ args[0]); //첫번째 인자로 받은 파일명의 경로 수집
        Path outputPath = Paths.get("/Users/a123123/IdeaProjects/15주차_실습과제/out/production/15주차_실습과제/"+args[1]); // 두번째 인자로 받은 파일명의 경로 수집

        try (InputStream in = Files.newInputStream(inputPath)) {
            do{
                i = in.read();
                try (OutputStream out = Files.newOutputStream(outputPath)) {
                    out.write((byte)i);
                }
            }while(i != -1);
        }
    }
}
