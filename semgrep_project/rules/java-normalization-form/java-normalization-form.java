class Main 
{ 
    public void normalizeform(){
    s = Normalizer.normalize(s, Form.NFKD); //noncompliant
    s = Normalizer.normalize(s, Form.NFKC); //compliant
 }
}