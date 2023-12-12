#string reverse without reversing words
def reverse1(str):
    result=''
    w=str.split(' ')
    for i in range(len(w)-1,-1,-1):
        result+=w[i]+" "
    return result

s="hello students"
print(reverse1(s))