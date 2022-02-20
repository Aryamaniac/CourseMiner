<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>Your Minors & Certificates</title>
	<link rel="shortcut icon" type="image/jpg" href="pickaxe 500.png"/>
	
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
		background-color: #252CBB;
		display: inline-flex;
		flex-direction: row;
		width: 100%;
		justify-content: space-between;

	}



	.top {
		display: inline-flex;
		flex-direction: row;
		width: 100%;
		justify-content: flex-start;
		margin-top: 20px;
		margin-bottom: 30px;
		margin-left: 15px;
	}

	.print {
		color: white;
		background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
		border: none;
		/*padding-left: 23px;
		padding-right: 23px;*/
		font-size: 17px;
		padding: 10px 23px 10px 23px;
		height: 100%;
	}

	h2 {
		text-align: center;
		margin-left: 270px;
		font-family: 'Roboto', sans-serif;
		font-weight: 300;
		font-size: 35px;

	}

	.fullList {
		display: inline-flex;
		flex-direction: column;
		width: 100%;
	}

	.minor {
		display: inline-flex;
		flex-direction: row;
		border-bottom: thin;
		border-style: solid;
		border-width: 0px 0px 1px 0px;
		/*justify-content: space-between;*/
		width: 100%;
		margin-bottom: 15px;
		margin-top: 7px;
	}

.classInfo {
		display: inline-flex;
		flex-direction: row;
		/*justify-content: space-between;*/
		width: 100%;
	}

	h3 {
		font-size: 17px;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
		/*margin: 20px 30px 30px 20px;*/
		border-color: #F14A75;
		border-style: solid;
		padding: 10px 15px 10px 15px;
		border-radius: 30px;
		border-width: 2px;
		margin: 0px 30px 30px 20px;
		/*margin-bottom: 10px;*/

	}

	h4 {
		font-size: 17px;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
		padding-bottom: 15px;
		padding-top: 15px;
		margin-right: 10px;
	}

	h5 {
		font-style: italic;
		font-size: 17px;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
		padding-bottom: 15px;
		padding-top: 15px;
		margin-right: 30px;
	}



	.info {
		color: white;
		background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
		border: none;
		/*padding-left: 20px;
		padding-right: 20px;*/
		padding: 10px 8px 10px 8px;
		font-size: 17px;
		margin: 6px 25px 15px 0px;
		width: 11%;
		height: 100%;
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
        background-color: #C4C4C4;
        border: 10px solid #C4C4C4;
        box-sizing: content-box;
        font-size: 1em;
        letter-spacing: 0%;
        text-align: center;
        font-family: Ramaraja, sans-serif; 
      

        
        position: absolute;
        bottom: 0;
        left: 0;
        right: 0;
    }
	</style>
</head>
<body>
	
	<div class = header>
		<a href="Homepage.jsp" class="logo" alt="CourseMiner"><img id="logo" src="Logo.png" width="300"></a>
		<div class="UGA">
			<h1>University of Georgia</h1>
		</div>
	</div>



	<div class="top">
		<button class="print" onclick="window.print()" type="button">Print</button>

		<h2>Minors and Certificates for You</h2>
	</div>

	<div class="fullList">

		<div class="minor">

			<div class="classInfo">
				<h3>1</h3>
				<h4>Applied Biotechnology - </h4>
				<h5>4 credit hours remaining</h5>
			</div>

			<button class="info" form="viewInfo" type="submit">View Info</button>
		</div>

		<div class="minor">

			<div class="classInfo">
				<h3>2</h3>
				<h4>Crop Science - </h4>
				<h5>6 credit hours remaining</h5>
			</div>

				<button class="info" form="viewInfo" type="submit">View Info</button>

		</div>
		
	</div>
	
	<form id="viewInfo" action="viewInfo" method="POST"></form>




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