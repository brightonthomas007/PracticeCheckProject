<!DOCTYPE html>
<html lang="en">
<head>
  <title>Administrator Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button5 {background-color: #cccccc;}

.abc {
  box-shadow: 0 4px 8px 0 rgba(1, 1, 1, 1);
  max-width: 300px;
  margin: 22px;
  text-align: center;
  font-family: arial;
  height:50vh;
 	word-wrap:break-word;
}

.title {
  color: grey;
  font-size: 18px;
}
button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}
a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}
button:hover, a:hover {
  opacity: 0.7;
}
</style>

</head>
<body>


<nav class="navbar navbar-default" role="navigation">

    <div  style="float:left !important;">
       
        <a class="navbar-brand" href="#" >GRIZZLY STORE</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

        <div class="col-sm-3 col-md-3 pull-center">
            <form class="navbar-form" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </form>
        </div>
        
        <% String name=request.getParameter("userName"); %>
        
        <div>
          <ul class="nav navbar-nav pull-center">
              <li class="#"><a href="#"><strong><p>Welcome <%out.print(name); %> </p></strong></a></li>
          </ul>
         </div>


         <div>
           <ul class="nav navbar-nav pull-right">
               <form action="logout" method="get">
              		 <button class="button button5">Logout</button>
             	</form>
           </ul>
          </div>


      </div>
</nav>



<div class="container-fluid">
  <div class="row">
    <div class="col-md-2 card">
      <div class="" >
        <img src="" alt="John" style="width:100%">
        <h1><%out.print(name); %> </h1>
        
      
        <p><button>Contact</button></p>
      </div>
    </div>
    
    <div class="col-md-9 card abc" style="height:70vh;" >
      <ul class="nav nav-tabs" role="tablist">
      
    <li class="nav-item">
      <a class="nav-link active" data-toggle="tab" href="#add" >Add</a>
    </li>
    
    <li class="nav-item">
      <a class="nav-link " data-toggle="tab" href="#products" >Products</a>
    </li>
    
    <li class="nav-item">
      <a class="nav-link" data-toggle="tab" href="#vendors" >Vendors</a>
    </li>
    
  </ul>
  <br>



  <div class="tab-content">
              <div id="add" class="container tab-pane active"><br>
                        <jsp:include page="AddProductPage.html"/>
              </div>
              
              
             <div id="products" class="container tab-pane fade"><br>
              	 		<jsp:include page="ProductPage.jsp"/>
             </div>
             
             
             <div id="vendors" class="container tab-pane fade"><br>
                    <h3>Vendors</h3>
                    <p></p>
             </div>
    </div>


  </div>


</div>



</body>
</html>
