def find_repetitive_chars(str):
    # Initialize an empty list to store repetitive characters
    repetitive_chars = []

    # Iterate over each character in the string
    for i in range(len(str)):
        # Check if the character is already in repetitive_chars
        if str[i] not in repetitive_chars:
            # Check if the character appears again in the rest of the string
            for j in range(i + 1, len(str)):
                if str[i] == str[j]:
                    # If the character is repetitive and not already in repetitive_chars, add it
                    repetitive_chars.append(str[i])
                    break

    return repetitive_chars

print(find_repetitive_chars("hello"))
