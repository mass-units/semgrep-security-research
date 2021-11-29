const execa = require('execa');

async function (req, res) {
  const cmd = "ls -la "+req.query.arg;

  const {stdout} = await execa.command(cmd); // Noncompliant
};

async function (req, res) {
  const arg = req.query.arg;

  const {stdout} = await execa("ls", ["-la", arg]); // Compliant
};