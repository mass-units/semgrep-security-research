class Main {
    public void consume() {
      synchronized (vector) {
        if (vector.isEmpty()) { //noncompliant
          vector.wait(); 
        }
      }
    }
    
    public void consume2() {
        synchronized (vector) {
            while (vector.isEmpty()) { //compliant
                vector.wait();
    }
    }
}
}