class Main {

    public void domyspec() {
    ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
          .tlsVersions(TlsVersion.TLS_1_1) // Noncompliant
          .build();
    }
    
    public void domyspec2() {
    ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
          .tlsVersions(TlsVersion.TLS_1_2) // Compliant
          .build();
    }
    }