package mvc.controller;

import java.io.FileOutputStream;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.google.gson.JsonElement;
import java.lang.ClassNotFoundException;

import mvc.model.Minor;
import mvc.model.Course;

/**
 * Servlet implementation class UploadTextfileController
 */
@WebServlet("/uploadTextfile")
@MultipartConfig
public class UploadTextfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UploadTextfileController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Receive file uploaded to the Servlet from the HTML form */
		Part file = request.getPart("textfile");
		String textfileName = file.getSubmittedFileName();
		String path = "C:/Users/dadeo/eclipse-workspace/CourseMiner/src/main/webapp/textfiles/" + textfileName;
		
		//saves file in textfiles folder
		FileOutputStream fos = new FileOutputStream(path);
		InputStream is = file.getInputStream();
		
		byte[] data = new byte[is.available()];
		is.read(data);
		fos.write(data);
		fos.close();
		
		// Open the file.
        FileReader fr = new FileReader(path);
        Scanner inFile = new Scanner(fr);
        ArrayList<String> courseList = new ArrayList<String>();
        ArrayList<Course> userCourses = new ArrayList<Course>();

        // Read lines from the file till end of file
        while (inFile.hasNext())
        {
            // Read the next line.
            String line = inFile.nextLine();
            courseList.add(line);
            String[] info = line.split(" ");
            userCourses.add(new Course(Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[0]));
            // Display the line.
            System.out.println(line);
        } 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("MinorCertificateDetails.jsp");
		dispatcher.forward(request, response);
	}

}
