rules:
- id: typescript-bypass-security-trust-resource-url
  pattern: $A.bypassSecurityTrustResourceUrl(...)
  message: Semgrep found bypassSecurityTrustResourceUrl, which should be used cautiously because it bypasses sanitization.
  metadata:
      references:
        - https://angular.io/api/platform-browser/DomSanitizer
  languages: [ts]
  severity: WARNING
