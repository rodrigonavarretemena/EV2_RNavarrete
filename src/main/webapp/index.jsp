<%-- 
    Document   : index
    Created on : 29-09-2022, 11:01:01
    Author     : rodri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro personas</title>
        <!-- Bootstrap core CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    
  
    <body> 
        <br><br><br><br>
        <main class="container">
            <h1>Registro de personas</h1>
            <form nombre="frmFormulario1" class="row" method="get" action="Servlet_control">
                                          
              
                <div class="col-7">
                    <label for="inputNombre" class="form-label">Nombre</label>
                    <input type="text" class="form-control" name="inputNombre" placeholder="Juan Perez" required>
                </div>
              
                
                <div class="col-7">
                    <label for="inputEdad" class="form-label"> Edad</label>
                    <input type="number" class="form-control" name="inputEdad" placeholder="40" required>
                </div>
                
                
                <div class="col-7">
                    <label for="inputDireccion" class="form-label">Direccion</label>
                    <input type="text" class="form-control" name="inputDireccion" placeholder="Calle siempre viva #1313" required>
                </div>
                
                <div class="col-7">
                    <label for="inputCorreo" class="form-label">Correo</label>
                    <input type="text" class="form-control" name="inputCorreo" placeholder="No@tengo.com" required>
                </div>
                
                <div class="col-7">
                    <label for="inputFono" class="form-label">Fono</label>
                    <input type="number" class="form-control" name="inputFono" placeholder="123456789" required>
                </div>
                
                <div>
                <br>
                <button type="submit" class="btn btn-primary">Enviar</button>
                </div>
            </form>
        </main>
        
        
    </body>
</html>
