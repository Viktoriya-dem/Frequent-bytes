
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Frequent_bytes {
    public static void main(String[] args) throws Exception {

        int[] array = new int[256];

        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                array[data]++;
            }
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) max = array[i];
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) System.out.print(i + " ");
            }


        }
    }
}