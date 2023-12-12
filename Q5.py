#check two strings are anagram or not
def check_Anagram(str1,str2):
    for i in str1:
        if(str1.count(i)==str2.count(i)):
            continue
        else:
            return False
    return True

s='listen'
s2='silent'
print(check_Anagram(s,s2))