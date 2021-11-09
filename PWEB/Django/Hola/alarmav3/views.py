from django import forms
from django.shortcuts import render
from django.urls import reverse


# Create your views here.
def index (request):
    return render(request,'alarmas/index.html', {"alarmas":alarmas})

def v2(request):
    if request.method == 'POST':
        form =FNuevaAlarma(request.POST)
        if form.is_valid():
            alarma = form.cleaned:data['id']
            alarmas.append(alarma)
            return httpResponseRedirect(reverse("alarmas:index"))
        else
            return render(request, "alarmas/nueva.html", {"cont.form": form})
        else
            return render(request, "alarmas/nueva.html", {"cont.form": FNuevaAlarma})


def nueva(request):
    if request.method == "POST":
        FORM =FNuevaAlarma(request.POST)#vacio->nuevo;lleno->toma valores actuales
        if form.is_valid():
            alarma = form.cleaned:data["nueva_alarma"]
            alarmas.append(alarma)
            return httpResponseRedirect(reverse("alarmas:index"))
        else:
            return render(request,"alarmas/nueva.html",{"cont.form":form})#reverse?
        else
        return render(request, "alarmas/nueva.html", {"cont.form": FNuevaAlarma})
class FNuevaAlarma(forms.form):
    alarma= forms.charfield(label='Nueva alarma')


