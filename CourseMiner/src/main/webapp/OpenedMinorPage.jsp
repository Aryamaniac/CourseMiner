<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>Your Minor</title>
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


	.mainBody {
		display: inline-flex;
		flex-direction: column;
		height: 100%;
		justify-content: space-between;
	}





	.subBody {
		display: inline-flex;
		flex-direction: row;
		margin: 50px 10px 0px 35px;
		width: 100%;
		height: 100%;
	}


	.leftSide {
		display: inline-flex;
		flex-direction: column;
		width: 55%;


	}

	h2 {
		color: #252CBB;
		font-size: 30px;
		font-weight: 400;
		font-family: 'Roboto', sans-serif;
	}


	h3 {
		font-size: 20px;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
		font-style: italic;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
		margin: 8px 0px 40px 30px;
	}

	p {
		font-size: 16px;
		font-family: 'Roboto', sans-serif;
		font-weight: 400;
	}


	.rightSide {
		display: inline-flex;
		flex-direction: column;
		margin-left: 35px;

		width: 45%;
	}

	.creditHours {
		display: inline-flex;
		flex-direction: row;
		width: 100%;
	}

	h4 {
		font-family: 'Roboto', sans-serif;
		font-size: 27px;
		font-weight: 300;
		color: white;
		background-color: #F65663;
		
		padding: 19px 28px 19px 28px;
		border-radius: 50px;
		border-width: 2px;
		margin-left: 50px;
	}

	h5 {
		font-family: 'Roboto', sans-serif;
		font-size: 22px;
		font-weight: 400;
		text-align: center;
		margin-left: 35px;
		margin-top: 11px;
	}

	h6 {
		font-family: 'Roboto', sans-serif;
		font-size: 18px;
		font-weight: 300;
	}


	.stillNeed {
		margin-left: 162px;
		margin-top: 30px;
		font-style: italic;
	}

	.className {
		margin-left: 200px;
		margin-top: 10px;
	}

	.or {
		margin-left: 200px;
		margin-top: 10px;
	}






	.print {
		color: white;
		background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
		border: none;
		/*padding-left: 23px;
		padding-right: 23px;*/
		font-size: 17px;
		padding: 7px 23px 7px 23px;
		/*margin-right: 400px;*/
		/*height: 100%;*/
		width: 20%;
		margin: 110px 0px 0px 470px;




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




<!-- 	<div class="mainBody"> -->
		<div class="subBody">

			<div class="leftSide">
				<h2>Applied Biotechnology Minor</h2>
				<h3>College of Agricultural and Environmental Services</h3>

				<p>
					The College of Agricultural and Environmental Sciences offers a variety of minors for students looking to enhance or individualize their degree at UGA. Obtaining a minor allows students to specialize in an area of interest through specific courses and can often be achieved through the elective options in their major degree plan. 

					<br> <br>

					Students in the Applied Biotechnology minor gain the scientific background and laboratory experience necessary studying molecular biology, molecular genetics and DNA extraction. 
				</p>

				<button class="print" onclick="window.print()" type="button">Print</button>
				

			</div>

			<div class="rightSide">

				<div class="creditHours">
					<h4>4</h4>
					<h5>Credit Hours <br> Remaining</h5>
				</div>

				<h6 class="stillNeed">Still Need:</h6>
				<h6 class="className">-MATH 2260</h6>
				<h6 class="or">OR</h6>
				<h6 class="className">-STAT 4210</h6>
				

			</div>
			

		</div>






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