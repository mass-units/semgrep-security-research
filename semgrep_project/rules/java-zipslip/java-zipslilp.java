rules:
- id: java-zipslip
  patterns:
    - pattern: |
        ZipEntry $A = $B.nextElement();
        File $D = new File(..., $A.getName(), ...);
        ...
        $METHOD(..., $D, ...);
    - pattern-not: |
        ZipEntry $A = $B.nextElement();
        File $D = new File(..., $A.getName(), ...);
        ...
        $CDP = $D.getCanonicalPath();
        ...
        if(!$CDP.startsWith($TD))
        {
          ...
        }
        $METHOD(..., $D, ...);
    - pattern-not: |
        ZipEntry $A = $B.nextElement();
        File $D = new File(..., $A.getName(), ...);
        ...
        $CDP = $D.getCanonicalPath();
        ...
        if($CDP.startsWith($TD))
        {
          ...
          $METHOD(..., $D, ...);
          ...
        }
  message: Possible zip-slip vulnerability, use $D.getCanonicalPath to divert directory traversal.
  languages: [java]
  severity: WARNING

