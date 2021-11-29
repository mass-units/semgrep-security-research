class Main {
public void parseXML(InputStream input) throws XMLStreamException {

    XMLInputFactory factory = XMLInputFactory.newFactory();
    XMLStreamReader reader = factory.createXMLStreamReader(input); //noncompliant
}

public void parseXML(InputStream input) throws XMLStreamException {

    XMLInputFactory factory = XMLInputFactory.newFactory();
    factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
    XMLStreamReader reader = factory.createXMLStreamReader(input); //compliant 
}
}
