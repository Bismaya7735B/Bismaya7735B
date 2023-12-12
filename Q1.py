def replace(str):
    rchar=''
    s=''
    for c1 in str:
        c=0
        for c2 in str:
            if c1==c2:
                c+=1
        if c==2:
            rchar=c1

    for c3 in str:
        if c3==rchar:
            s+='*'
        else:
            s+=c3
    return s



b="hello"
print(replace(b))