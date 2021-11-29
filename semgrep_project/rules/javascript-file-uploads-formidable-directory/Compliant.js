const Formidable = require('formidable');

const form = new Formidable(); // Compliant
form.uploadDir = "./uploads/";
form.keepExtensions = false;