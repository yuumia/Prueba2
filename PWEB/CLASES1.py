class vuelo:
    def __init__(self,capacidad):
        self.capacidad = capacidad
        self.pasajeros = []
    def getDisponibles(self):
        return self.capacidad -len(self.pasajeros)
    def addPasajeros(self,nombre):
        if self.pasajeros.append(nombre)
            self.pasajeros.append(nombre)
            return True
        else:
            return False
        ###############################
        if not self .getDisponible
            return False
        self.addPasajero(nombre)
        return True

Vuelo=vuelo(3)
print(Vuelo.getDisponibles())
print(vuelo.addPasajeros('max1'))
print(vuelo.addPasajeros('max2'))
print(vuelo.addPasajeros('max3'))
print(vuelo.addPasajeros('max4'))
print(Vuelo.getDisponibles())

