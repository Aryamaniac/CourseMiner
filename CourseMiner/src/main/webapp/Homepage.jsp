<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<meta charset="utf-8">
	<title>Home Page</title>
	<link rel="shortcut icon" type="image/jpg" href="pickaxe 500.png"/>
	<!-- <link rel="preconnect" href="https://fonts.googleapis.com"> 
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin> 
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,700;1,600&family=Roboto&display=swap" rel="stylesheet">
	 -->
	 
	 <style>
	 	* {
		margin: 0px;
		padding: 0px;
	}

	h1 {
		font-size: 20px;
		color: #F75761;
		font-family: 'Roboto', sans-serif;
		border-style: solid;
		border-color: #F75761;
		margin-right: 40px;
		margin-top: 18px;
		font-weight: 500;
		padding: 4px;
	}

	.header {
		
		display: inline-flex;
		flex-direction: row;
		width: 100%;
		justify-content: space-between;
        padding-right:10px;
        

	}
    .main{
        border-left: 3px solid white;
        margin-left: 150px;
        padding-bottom:100px;
        
    }

    .main h2{
        color:white;
        font-size: 60px;
        font-family: 'Roboto',sans-serif;
        padding-top:30px;
        margin-top:50px;
        margin-left:50px;
        
    }

    .main h3{
        color:white;
        font-family: 'Roboto',sans-serif;
        font-weight: 300;
        margin-left: 280px;
        margin-top: 10px;
        font-size:25px;
    }
    body{
        background: linear-gradient(180deg, #252CBB 0%, rgba(112, 23, 92, 0.92) 99.99%, rgba(177, 37, 200, 0) 100%);
        margin-bottom: 150px;

    }
	
    #login{
        background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
        padding:8px;
        color:white;
        padding-left:20px;
        padding-right: 20px;
        border-style: none;
        margin-top: 40px;
        margin-right:70px;
        font-size: large;
    }
    
    #start{
        background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
        padding:10px;
        color:white;
        padding-left:25px;
        padding-right: 25px;
        border-style: none;
        margin-top: 0px;
        margin-left:800px;
        font-size: large;
    
    }

    #footerLogos li {
        float: left;
        list-style-type: none;
        color: #000000;
        padding-right: 1em;
    }
    
    #footerLogos ul {
        float: left;
        bottom: -.5em; 
        left: 0; 
    }

    .grow { 
        transition: all .2s ease-in-out; 
    }
    
    .grow:hover { 
        transform: scale(1.05); 
    }
    
    
    #copyright {
        float: right;  
        right: 2%; 
        bottom: 0;
    }
    
    #footer{
        color: black;
        background-color: white;
        border: 10px solid white;
        box-sizing: content-box;
        font-size: 1em;
        letter-spacing: 0%;
        text-align: center;
        font-family: Ramaraja, sans-serif; 
        margin-top:0px;
        
        position: absolute;
        bottom: 0;
        left: 0;
        right: 0;
    }
	 	
	 </style>
	 
</head>
<body>
	
	<div class = header>
		<a href="#" class="logo" alt="CourseMiner"><img id="logo" src="Logo2.png" width="300"></a>
		<div class="UGA">
			<button id="login" onclick="location.href='UploadCourses.jsp'" type="button">Log In</button>
            
		</div>
	</div>
    
    
	<div class="main">
        <h2>Explore new paths. </h2>
        <h3>Find minors and certificates <br> catered to your transcript</h3>
       
	</div>

    <button id="start" onclick="location.href='UploadCourses.jsp'" type="button">Get Started</button>
    


	<div id="footer">
        <div id="footerLogos">
              <ul>
                  <li><a href="https://www.facebook.com/"><img src="fbLogo.png"
                      class="grow" alt="Facebook" width="50"></a></li>
  
                  <li><a href="https://twitter.com/"><img src="twitLogo.png"
                      class="grow" alt="Twitter" width="52" style="padding-top:5px;"></a></li>
          
                  <li><a href="https://www.youtube.com/"><img src="youtubeLogo.png"
                      class="grow" alt="Youtube" width="60"style="padding-top:5px;"></a></li>
  
                  <li><a href="https://www.instagram.com/"><img src="instaLogo.png"
                      class="grow" alt="Instagram" width="40"style="padding-top:5px;"></a></li>
              </ul>
          </div>
          <p id="copyright" style="padding-top:15px;padding-right: 20px;">&copy; 2022 CourseMiner</p>
      </div>

</body>
</html>