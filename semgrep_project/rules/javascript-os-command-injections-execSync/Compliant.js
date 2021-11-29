const cp = require('child_process');

function (req, res) {
  const out = cp.execFileSync("ls", [req.query.arg]); // Compliant
}