<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="css/ModificarProyecto.css">
    <title>Proyectos</title>
    <div class="header">

        <img src="iconos/Group.png" width="75px">
        <div class="casita">
            <img src="iconos/image 3 (1).png" alt="">
        </div>
    </div>
</head>

<body>



    <form action="" method="">
        <div class="caja">
            
            <center>
                <h1 class="titulo">Modificar Proyecto</h1>
            </center>
            <div class="nombreProyecto">
                <label for=" NombreProyecto" class="form-check--1">
                    <h5 class="NombreProyecto">Nombre del Proyecto</h5>
                </label>
                <input type="text" class="form-control" id="NombreProyecto" placeholder="Ingrese Nombre del Proyecto">
            </div>


            <div class="CodigoProyecto">
                <label for="CodigoProyecto" class="form-check--2">
                    <h5>Codigo del Proyecto</h5>
                </label>
                <input type="text" class="form-control" id="CodigoProyecto" placeholder="Ingrese Codigo del Proyecto">
            </div>


            <div class="Fecha">
                <label for="exampleFormControlInput1" class="form-check--5">
                    <h5>Fecha de Entrega</h5>
                </label>

                <input type="date" class="form-control" id="exampleFormControlInput1"
                    placeholder="Ingrese Fecha de Entrega" required>
            </div>
            <div class="TipoProyecto">
                <label for="exampleFormControlInput1" class="form-check--3">
                    <h5>Tipo de Proyecto</h5>
                </label>

                <select class="select-css">
                    <option>Seleccione Tipo de Proyecto</option>
                    <option value="1">Comunitario</option>
                    <option value="2">Educativo</option>
                    <option value="3">Residencial</option>
                    <option value="3">Estatal</option>
                    <option value="3">Hidraulica</option>
                    <option value="3">Comercial</option>
                    <option value="3">Salud</option>
                </select>
            </div>

            <div class="Estado">
                <label for="exampleFormControlInput1" class="form-check--4">
                    <h5>Estado</h5>
                </label>

                <select class="select-css--1">
                    <option>Seleccione Estado actual del Proyecto</option>
                    <option value="1">Pendiente</option>
                    <option value="2">Terminado</option>
                    <option value="3">Proceso</option>

                </select>
            </div>

            <div class="Descripcion">
                <label for="exampleFormControlInput1" class="form-check--6">
                    <h5>Descripcion</h5>
                </label>
                <textarea class="form-control" rows="3"></textarea>

            </div>

            <button class="btn third">Aceptar</button>


        </div>
    </form>

</body>

</html>