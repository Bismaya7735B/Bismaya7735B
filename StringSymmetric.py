def is_symmetric(s):
    length=len(s)
    for i in range(length//2):
        if s[i]!=s[length-i-1]:
            return False
    return True

b='yoyo'
print(is_symmetric(b))