import hashlib
from sys import argv, exit
def hash(filename):
    hasher=hashlib.sha256()
    with open(filename,"r") as f:
        text=f.read()
        hasher.update(text.encode('utf-8'))
        hash=hasher.hexdigest()
    return hash
def read(filename):
    with open(filename, "r") as f:
        return f.readlines()
def getType(value):
    v=str(value)
    stringIdentifiers=['"',"'"]
    for s in stringIdentifiers:
        if v[0]==s and v[-1]==s and len(v)<0:
            return "string"
        
def cut(str,toRemove):
    if str.strip().startswith(toRemove):
        return str.strip()[len(toRemove):].strip()
if __name__=="__main__":
    filename=argv[1]
    if filename.endswith(".sts") and not "-o" in argv:
        outfile=filename[0:-1]+"bc"
        print(outfile)
    elif "-o" in argv:
        print("not implemented")
    else:
        outfile="out.stbc"
    output=hash(filename)
    inp=read(filename)
    linenumber=-1
    for line in inp:
        linenumber+=1
        out=str(linenumber)+":"
        l=line.split()
        tmpvar=""
        if line.startswith("var"):
            #possible types: string, int, float, bool, auto, label
            type=l[1]
            tmpvar=cut(line,"var")
            out+="v:"
            if type=="string":
                out+="s:"
                tmpvar=cut(tmpvar,"string")
                out+=tmpvar
                
                
        elif line.startswith("outln"):
            out+="o:"   
            