Code for Footer:

<html>

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

</html>

<style>

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
