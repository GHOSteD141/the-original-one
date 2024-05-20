file= open('odd.txt','w+')
file.write("all odd nos\n")
x =int(input("enter the range"))
for i in range(1,x,2):
    file.write(str(i)+" ")
    print("success odd")
    file.close()

file= open('even.txt','w+')
file.write("all even nos\n")
x =int(input("enter the range"))
for i in range(2,x,2):
    file.write(str(i)+" ")
    print("success even")
    file.close()
