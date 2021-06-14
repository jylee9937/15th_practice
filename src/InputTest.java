import java.io.*;

public class InputTest {
    public static void main (String[] arg) throws IOException {
        try {
            InputStream a = new FileInputStream("/Users/a123123/IdeaProjects/15주차_실습과제/out/production/15주차_실습과제/employee.dat");
            OutputStream out = new FileOutputStream("/Users/a123123/IdeaProjects/15주차_실습과제/out/production/15주차_실습과제/out.dat");

            while(true){

                int i = a.read();

                System.out.println("hi : " + (byte)i);
                out.write((byte)i);

                if ( i == -1 ) break;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}