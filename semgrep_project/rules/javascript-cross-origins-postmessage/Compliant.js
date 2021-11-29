var iframe = document.getElementById("testsecureiframe");
iframe.contentWindow.postMessage("hello", "https://secure.example.com"); // Compliant