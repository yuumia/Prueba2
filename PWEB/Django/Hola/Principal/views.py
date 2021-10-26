from django.shortcuts import render
from django.http import HttpResponse
from _datetime import datetime

# Create your views here.
def holaDjango(request):
    return HttpResponse("Hola Django")

# Create your views here.
def holapepe(request):
    return HttpResponse("Hola pepe")

def holaTu(request,nombre):
    return HttpResponse(f'Hola{nombre.capitalize()}!')

def indice(request):
    return render(request, 'Principal/Templates/Principal/index.html')

def indicePARAM(request, name):
    return render(request, 'principal/saludos.html',{'name': nombre.capitalize()})

def index(request):
    return render(request,'Principal/index.html',{
        'esViernes': datetime.today().isoweekday() ==5
    });









