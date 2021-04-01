import jwt as tokenizer

def accept_request():
    decode = tokenizer.decode(token, "password", verify=False)

def accept_other_request():
    decode = jwt.decode(token, "password")
