#Listas
nombre = 'paulina'
print(nombre[0])
nombres = ['paulina','balam','ivan']
print(nombres)
nombres[0] = 'lalo'
print(nombres)
nombres.sort()
print(nombres)
nombres.append('paulina')
nombres.reverse()
print(nombres)
#tuplas
tupla=(1,2,3,4,5)
print(tupla)
print(tupla.count(3))
print(tupla.index(1))
#tupla[0]=23

#SET
s=set()
s.add(1)
s.add(2)
s.add(3)
s.add(4)
s.add(5)
print(s)
s.remove(3)
print(s)
s.add(2)
s.add(2)
s.add(2)
print(s)

#DICCIONARIO

edades={'paulina':21,'balam':31,'ivan':50}
colores={'rojo':255}
print(edades)
print(edades['balam'])
print(edades)

#MATRICES
m=[1,2,3],[4,5,6]
print(m)
print(m[0][2])
