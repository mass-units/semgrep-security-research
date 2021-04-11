/*
*evaluate with multiple unique conditionals to demonstrate the need for multiple rules to search for 
*similar things - pattern operators have to be used in conjunction which allows us to eliminate false positives 
*/
//fastest secure coding lesson ever:
    //in order to cover some cases your ifs need an else for sanitization

    function good_evaluate(value)
    {
        var cmd = value;
        if(cmd === "a")
            cmd = "console.log('a');";
        else if(cmd === "b")
            cmd = "console.log('b');";
        else
            cmd = "console.log('else');";
        eval(cmd);
    }
    
    function bad_evaluate(value)
    {
        var cmd = value;
        if(cmd === "a")
            cmd = "console.log('a');";
        else if(cmd === "b")
            cmd = "console.log('b');";
        eval(cmd);
    }
    
    function other__bad_evaluate(value) 
    {
        var cmd = value;
        if(cmd === "a")
            cmd = "console.log('a');";
        if(cmd === "b")
            cmd = "console.log('b');";
        eval(cmd);
    }
    
    function test_evaluate(value)
    {
        good_evaluate("a");
        good_evaluate("a;console.log('evil');");
        bad_evaluate("a");
        bad_evaluate("a;console.log('evil');");
        other_bad_evaluate("a");
        other_bad_evaluate("a;console.log('evil');");
    }