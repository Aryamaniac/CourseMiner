<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Courses</title>

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
        padding-right:10px;
        

	}
	
    #circle{
        position: relative;
        width: 74px;
        height: 74px;
        left: 34px;
        top: 50px;

        border: 3px solid #F4516A;
        border-radius: 50px;
        box-sizing: border-box;

    }
    #text {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        color: black;
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

    #step1 h2{
        font-family: Roboto;
        font-style: normal;
        font-weight: lighter;
        font-size: 36px;
        line-height: 42px;
        display: flex;
        align-items: center;
        text-align: center;
        color: #000000;
    }

    ::-webkit-file-upload-button{
    
        
        border: 1px solid #ccc;
        display: inline-block;
        padding: 6px 12px;
        cursor: pointer;
        margin-top: 50px;
        margin-left: 50px;
        color: white;

        background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);

    }

    #find{
        background: linear-gradient(180deg, #F14A75 0%, #FC644D 100%);
        padding:10px;
        padding-left:15px;
        border-style: none;
        margin-left: 120px;
        color:white;
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
    
    
	<div class="main">
        <div id="circle">
           <div id="text"><h2>1</h2></div> 
        </div>
        <div class="step1">
			<h2 style="padding-left: 120px;display: inline-block;">Upload Your Transcript</h2>
		</div>
        <input form="uploadTextfile" type="file" name="textfile" required>
        <form id="uploadTextfile" action="uploadTextfile" enctype='multipart/form-data' method="POST"></form>

        <br>
        <div id="circle">
            <div id="text"><h2>2</h2></div> 
         </div>
         <div class="step1">
             <button form="uploadTextfile" id="find">Find Minors and Certificates</button>
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