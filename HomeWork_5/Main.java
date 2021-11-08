package HomeWorks.HomeWork_5;

import java.io.*;

public class Main {

    static AppData appData = new AppData();
    static File file = new File("src/main/java/HomeWorks/HomeWork_5/file.csv");
    static File file2 = new File("src/main/java/HomeWorks/HomeWork_5/file2.csv");
    static int[][] data = appData.getData();
    static int[][] data2 = appData.getData2();
    static int[][] data3 = appData.getData3();
    static int[][] data4 = appData.getData4();

    public static void main(String[] args) throws IOException {

        save(data, file);
        save(data2, file2);
        load(file);
        load(file2);
/*
        save(data3, file); //при новом вызове метода старые данные data перезаписываются на новые data3
        save(data4, file2); //при новом вызове метода старые данные data2 перезаписываются на новые data4
        load(file); // выведет заново записанные данные, при этом в консоли останутся и старые
        load(file2); // выведет заново записанные данные, при этом в консоли останутся и старые
*/
    }

    public static void save(int[][] data, File file) {
        StringBuilder string = new StringBuilder(String.join("; ", appData.getHeader()));
        for (int i = 0; i < data.length; i++) {
            string.append("\n");
            for (int j = 0; j < data[i].length; j++) {
                string.append(data[i][j]);
                if (j != data[i].length - 1) {
                    string.append("; ");
                }
                ;
            }
        }
        String dataString = string.toString();
        byte[] dataBytes = dataString.getBytes();
        try (OutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            fileOutputStream.write(dataBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void load(File file) {
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = fileInputStream.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




