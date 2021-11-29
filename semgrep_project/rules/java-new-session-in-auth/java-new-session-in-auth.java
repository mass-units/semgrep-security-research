class Main {
    protected void configure(HttpSecurity http) throws Exception {
       http.sessionManagement()
         .sessionFixation().none(); //noncompliant
    }
    
    protected void configure(HttpSecurity http) throws Exception {
      http.sessionManagement()
         .sessionFixation().newSession(); //compliant
      http.sessionManagement()
         .sessionFixation().migrateSession(); //compliant
    }
    }