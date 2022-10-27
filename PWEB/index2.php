<?php
function contar($veses)
{
 $respuesta="";
 for ($i=1; $i<=$veses;$i++)
 {
     if ($i%2==0)
         $respuesta.="".$i;
         echo $respuesta."<br>";
 }
}
?>