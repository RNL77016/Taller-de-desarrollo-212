<?php

    $consulta  = "SELECT * FROM Categorias";
    $query = $conn->prepare($consulta);
    $query->execute();

    while($registro = $query->fetch())
    {
        ?>
        <li class="nav-item">
          <a class="nav-link" href="?categoria=<?=$registro["id"]?>"><?=$registro["nombre"]?></a>
        </li>
        <?php
    }
?>

