import org.opensaml.xml.parse.BasicParserPool;
import org.opensaml.xml.parse.ParserPool;
import org.opensaml.xml.parse.BasicParserPool;

class Main {
public ParserPool parserPool() {
  BasicParserPool basicParserPool = new BasicParserPool();
  basicParserPool.setIgnoreComments(false); // Noncompliant: comments are not ignored during parsing opening the door to exploit the vulnerability
  return basicParserPool;
}

public ParserPool parserPool2() {
  return new BasicParserPool(); // Compliant: "ignoreComments" is set to "true" in BasicParserPool constructor
}
}