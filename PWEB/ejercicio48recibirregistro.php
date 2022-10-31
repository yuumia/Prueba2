<?php
$curp= $_POST['curp'];
$nom= $_POST['nombre'];
$directorio="archivosSubidosPorLosClientes/";
$carpetaPersonal=$directorio.$curp."/";
mkdir($carpetaPersonal,0777,true);
$CvCargado=$carpetaPersonal.basename($_FILES["cv"]["name"]);
$FotoCargada=$carpetaPersonal.basename($_FILES["Foto"]["name"]);
move_uploaded_file($_FILES["cv"]["tmpfile"],$CvCargado);
move_uploaded_file($_FILES["Foto"]["tmpfile"],$FotoCargada);
include('ejercicio46recibirregistro.php');
$insetarSQL="INSERT INTO´informacion´(´CURP´,´NOMBRE´,´CV´,´FOTO´)
            VALUES('$curp','$nom','$CvCargado',$FotoCargada)";
mysqli_query($conexion,$insertarSQL);
mysqli_close($conexion);
include('index3.html');
?>