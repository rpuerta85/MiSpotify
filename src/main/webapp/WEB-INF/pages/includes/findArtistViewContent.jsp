<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <div class="panel panel-default">
      <div class="panel-heading">
        <h1>
          <span aria-hidden="true" class="glyphicon glyphicon-user"></span> 
          ${findArtistViewBean.mapMsgs['panelHeaderTitle']} <small>${findArtistViewBean.mapMsgs['panelHeaderSubTitle']}</small>
        </h1>
        <p class="lead">${findArtistViewBean.mapMsgs['panelHeaderDescription']}</p>
      </div>
      <div class="panel-body">
        <form action="" method="post" class="form-horizontal" role="form">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="artista">${findArtistViewBean.mapMsgs['formFindArtistLabelValue']}</label>
            <div class="col-sm-4">
                <input type="text" required="required" placeholder="${findArtistViewBean.mapMsgs['formFindArtistInputTextPlaceholder']}" id="nombre" name="nombre" class="form-control">
            </div>
          </div>
          <div class="form-group">
            <button class="col-sm-offset-2 col-sm-1 btn btn-primary" type="submit">${findArtistViewBean.mapMsgs['formFindArtistButtonSubmitName']}</button>
          </div>
        </form>
      </div>
  </div>