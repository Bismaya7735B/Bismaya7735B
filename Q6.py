#count words to start with vowels
def countWords(str):
    str=str+" "
    count=0
    w=''
    for i in range(len(str)):
        c1=str[i]
        if c1!=' ':
            w+=c1
        else:
            c2=w[0]
            if c2 in 'aeiouAEIOU':
                print(w)
                count+=1
            w=''
    return count
s='I am a oy'
print(countWords(s))