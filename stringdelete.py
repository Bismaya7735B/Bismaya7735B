def find_repetitive_chars(str):#to delete or replace string
    # Initialize an empty string to store repetitive characters
    repetitive_chars = ''
    s=''
    # Iterate over each character in the string
    for i in range(len(str)):
        # Check if the character is already in repetitive_chars
        if str[i] not in repetitive_chars:
            # Check if the character appears again in the rest of the string
            for j in range(i + 1, len(str)):
                if str[i] == str[j]:
                    # If the character is repetitive and not already in repetitive_chars, add it
                    repetitive_chars += str[i]
                    break
    for i in str:
        if i in repetitive_chars:
            #s+="*"
            s+=''
        else:
            s+=i
    return s


print(find_repetitive_chars("Bismaya"))
