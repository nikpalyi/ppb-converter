package converter;

import converter.util.FileUtil;
import java.util.List;

public class MatchTimeConverterApp {

  public static void main(String[] args) {

    String inputFilepath = "testData.txt";
    MatchTimeConverter converter = new MatchTimeConverter();
    List<String> convertedList = converter.convert(FileUtil.readFile(inputFilepath));
    System.out.println("OUTPUT MATCH TIME DATA:");
    convertedList.forEach(System.out::println);
  }
}