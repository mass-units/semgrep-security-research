/*
*evaluate with multiple unique conditionals to demonstrate the need for multiple rules to search for 
*similar things
*/
//in order to cover some cases your ifs need an else for sanitization

function good_evaluate(value)
{
    var cmd = value;
    if(cmd === "a")
        cmd = "ls /public";
    else if(cmd === "b")
        cmd = "cat README";
    else
        cmd = "we are fine";
    eval(cmd);
}

function bad_evaluate(value)
{
    var cmd = value;
    if(cmd === "a")
        cmd = "ls /public";
    else if(cmd === "b")
        cmd = "cat README";
    eval(cmd);
}

function other__bad_evaluate(value) 
{
    var cmd = value;
    if(cmd === "a")
        cmd = "ls /public";
    if(cmd === "b")
        cmd = "cat README";
    eval(cmd);
}
