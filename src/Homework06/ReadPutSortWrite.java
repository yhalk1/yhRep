package Homework06;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ReadPutSortWrite {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\yhalk\\IdeaProjects\\yhRep16062020\\src\\Homework06\\Input");
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter("C:\\Users\\yhalk\\IdeaProjects\\yhRep16062020\\src\\Homework06\\Output");
            String line = buffReader.readLine();
            ArrayList<String> list = new ArrayList();
            while (line != null) {

                list.add(line);
                line = buffReader.readLine();
            }

            Collections.sort(list);
            System.out.println(list);

            for (int i = 0; i < list.size(); i++)
            {
                fileWriter.write(list.get(i));
                fileWriter.write("\n");
            }

            fileWriter.close();
            fileReader.close();
            buffReader.close();
        } catch (FileNotFoundException e)
        {
            e.getStackTrace();
        }

    }
}
