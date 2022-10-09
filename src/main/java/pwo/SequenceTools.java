package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SequenceTools {

    public static boolean writeToFile(
            Generator generator,
            int from, int to,
            String fileName,
            int n1,
            int n2) {
        try {
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(fileName));
            for (int i = from; i <= to; i++) {
                writer.write(generator.getTerm(i, n1, n2) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
