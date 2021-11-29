window.addEventListener("message", function(event) { // Noncompliant: no checks are done on the origin property.
    console.log(event.data);
});

window.addEventListener("message", function(event) {

    if (event.origin !== "http://example.org") // Compliant
      return;
  
    console.log(event.data)
  });