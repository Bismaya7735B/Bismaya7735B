def checkPalindrome(str):
    w=""
    for i in range(len(str)-1,-1,-1):
        w+=str[i]
    if w==str:
        return True
    else:
        return False

b='ara'
print(checkPalindrome(b))