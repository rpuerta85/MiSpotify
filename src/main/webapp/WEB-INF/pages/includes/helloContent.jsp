
   <div class="jumbotron">
      <h1>�Bienvenido!</h1>
      <p>Esta aplicaci�n pretende ser un ejemplo de uso de varias t�cnicas:
        </p><ul>
          <li>Por un lado, accede a datos externos empleando la
              <a title="Web API Endpoint Reference" target="_blank" href="https://developer.spotify.com/web-api/endpoint-reference/">API REST de Spotify</a></li>                
          <li>Por otro accede a datos locales a los que se accede empleando la capa de
          abstracci�n <a title="Doctrine Database Abstraction Layer" target="_blank" href="http://www.doctrine-project.org/projects/dbal.html">Doctrine DBAL</a></li>
          <li>Adem�s, tambi�n se emplea el framework HTML, CSS y JS <a title="Bootstrap framework" target="_blank" href="http://getbootstrap.com/">Bootstrap</a></li>
        </ul>
      <p></p>
      <p><a role="button" href="" class="btn btn-primary btn-lg">Seguir leyendo �</a></p>
    </div>
    
    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2><span aria-hidden="true" class="glyphicon glyphicon-user"></span> Artistas</h2>
          <p>A trav�s de esta opci�n puede obtener informaci�n de sus artistas preferidos,
              escuchar sus trabajos y marcarlos como favoritos para poder recuperarlos cuando desee.
          </p>
          <p><a role="button" href="${pageContext.request.contextPath}/artista/buscar" class="btn btn-primary">Buscar Artistas �</a></p>
        </div>
        <div class="col-md-4">
          <h2><span aria-hidden="true" class="glyphicon glyphicon-folder-open"></span> �lbumes
              <a target="_blank" href="http://lema.rae.es/dpd/srv/search?id=Kj74deVh7D6N8n0ZkD"><sup>*</sup></a></h2>
          <p>Tambi�n podr� realizar b�squedas a traves de los nombre de los �lbumes que m�s
              le gusten, ver la informaci�n del mismo y guardar sus �lbumes favoritos.
          </p>
          <p><a role="button" href="/album/buscar" class="btn btn-primary">Buscar �lbumes �</a></p>
        </div>
        <div class="col-md-4">
          <h2><span aria-hidden="true" class="glyphicon glyphicon-music"></span> Temas</h2>
          <p>De igual forma, podr� buscar toda la informaci�n relativa a sus temas favoritos,
              as� como escucharlos desde aqu� mismo.
          </p>
          <p><a role="button" href="/tema/buscar" class="btn btn-primary">Buscar Temas �</a></p>
        </div>
      </div>

    </div> 
