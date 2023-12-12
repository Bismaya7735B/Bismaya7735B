#check a string contains one aplhabet and one digit
def check1(str):
    flag1=False
    flag2=False
    for i in str:
        if i.isalpha():
            flag1=True
        if i.isdigit():
            flag2=True
    if flag1 and flag2:
        return True
    else:
        return False

print(check1('My3'))