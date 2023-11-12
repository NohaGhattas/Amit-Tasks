G=float (input("enter gravity number"))*10**-11
M=float (input("enter mass earth number"))*10**24
m=float (input("enter mass moon number"))*10**24
R=float (input("enter R number"))*10**22
F= (G*M*m/R**2)*10**8
print (F*10**20)