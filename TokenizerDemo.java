import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;

public class TokenizerDemo {

  public static void main(String[] args) throws IOException {
    DocumentPreprocessor dp = new DocumentPreprocessor("./sample.txt");
    for (List<HasWord> sentence : dp) {
      System.out.println(sentence);
    }
  }
}
