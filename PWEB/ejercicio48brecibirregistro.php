<?php
include ('index3.html');
$consultaSQL="SELECT*FROM´informacion´";
$registros=mysqli_query($conexion,$consultaSQL);
$nombrar="<table border>
    <thead>
        <tr>
            <th>CURP<th>
            <th>NOMBRE<th>
            <th>Cv<th>
            <th>Foto<th>
        </tr>
    </thead>
    <tbody>";
while ($linea=mysqli_fetch_array($registros))
{
    $rutaDelArchivoDeImagen=$linea['Foto'];
    $mostrar.="<tr><td>".$linea['CURP']."</td>";
    $mostrar.="<td>".$linea['NOMBRE']."</td>";
    $mostrar.="<td><a href=".$linea['Cv'].">BajarCv</a></td>";
    $mostrar.="<td><img src=".$linea['Foto']."></td></tr>";
}
$mostrar.="</table></tbody>";
mysqli_close($conexion);
$mostrar.="<button onclick=index3.html>continuar</button>>";
echo $mostrar;
?>