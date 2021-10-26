from django.urls import path
from . import views
urlpatterns = [
    path('admin',views.holaDjango, name="holaDjango"),
    path('pepe',views.holaDjango, name="holapepe"),
    path('indice', views.indice, name="indice"),
    path('indice/<str:nombre>', views.indicePARAM(), name="indice"),
    path('str:nombre',views.holaDjango, name="holapepe"),







    ]