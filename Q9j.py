#count frequency of characters in a string
#way -1
# def countFrequency(str):
#     str1=str.lower()
#     freq_list={}
#     for char in str1:
#         if char!=" ":
#             if char in freq_list:
#                 freq_list[char]+=1
#             else:
#                 freq_list[char]=1
#     return freq_list
#
# s='I am a boy'
# print(countFrequency(s))
def countFrequency(str):
    str1 = str.lower()
    for char in range(ord('a'), ord('z')):
        count = str1.count(chr(char))
        if count > 0:
            print(f"{chr(char)}: {count}",end=" ")

s = 'I am a boy'
countFrequency(s)
