import org.opensaml.xml.parse.BasicParserPool;
import org.opensaml.xml.parse.ParserPool;
import org.opensaml.xml.parse.StaticBasicParserPool;

class Main {
public ParserPool parserPool() {
  StaticBasicParserPool staticBasicParserPool = new StaticBasicParserPool();
  staticBasicParserPool.setIgnoreComments(false); // Noncompliant: comments are not ignored during parsing opening the door to exploit the vulnerability
  return staticBasicParserPool;
}

public ParserPool parserPool2() {
  return new StaticBasicParserPool(); // Compliant: "ignoreComments" is set to "true" in StaticBasicParserPool constructor
}
}