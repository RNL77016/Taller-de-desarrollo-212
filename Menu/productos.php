<div class="container">
        <div class="row">
            <?php
            
                if(!$categoria)
                    $consulta  = "SELECT * FROM Productos";
                else
                    $consulta  = "SELECT * FROM Productos"
                                WHERE fk_clave_cat = ".$categoria;

                $query = $conn->prepare($consulta);
                $query->execute();
                while($registro = $query->fetch())
                {
            ?>
                <div class="col-12 col-md-4 text-center">
                    <div class="card">
                        <img src="<?=$registro["Imagen"]?>" alt="">
                        <div class="card-body">
                            <h5 class="card-title"><?=$registro["Nombre"]?></h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>

            <?php
            }
            ?>
    </div>
</div>