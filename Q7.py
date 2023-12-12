#convert 1st letter of each word to upper case and other words to lower case
def capitalize_sentence(sentence):
    result = ''
    words = sentence.split(' ')
    for word in words:
        if word != '':
            ascii_val = ord(word[0])
            if 97 <= ascii_val <= 122:  # if the character is lowercase
                result += chr(ascii_val - 32)  # convert to uppercase
            else:
                result += word[0]

            for i in range(1, len(word)):
                ascii_val = ord(word[i])
                if 65 <= ascii_val <= 90:  # if the character is uppercase
                    result += chr(ascii_val + 32)  # convert to lowercase
                else:
                    result += word[i]

            result += ' '

    return result  # remove the trailing space


# Test the function
print(capitalize_sentence('hello world'))
