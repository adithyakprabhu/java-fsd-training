package coms.ust;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter obj = res.getWriter();
		obj.println("<!DOCTYPE html>   \r\n"
				+ "<html>   \r\n"
				+ "<head>  \r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \r\n"
				+ "<title> Login Page </title>  \r\n"
				+ "<style>   \r\n"
				+ "Body {  \r\n"
				+ "  font-family: Calibri, Helvetica, sans-serif;  \r\n"
				+ "  background-color: pink;  \r\n"
				+ "}  \r\n"
				+ "button {   \r\n"
				+ "       background-color: #4CAF50;   \r\n"
				+ "       width: 100%;  \r\n"
				+ "        color: orange;   \r\n"
				+ "        padding: 15px;   \r\n"
				+ "        margin: 10px 0px;   \r\n"
				+ "        border: none;   \r\n"
				+ "        cursor: pointer;   \r\n"
				+ "         }   \r\n"
				+ " form {   \r\n"
				+ "        border: 3px solid #f1f1f1;   \r\n"
				+ "    }   \r\n"
				+ " input[type=text], input[type=password] {   \r\n"
				+ "        width: 100%;   \r\n"
				+ "        margin: 8px 0;  \r\n"
				+ "        padding: 12px 20px;   \r\n"
				+ "        display: inline-block;   \r\n"
				+ "        border: 2px solid green;   \r\n"
				+ "        box-sizing: border-box;   \r\n"
				+ "    }  \r\n"
				+ " button:hover {   \r\n"
				+ "        opacity: 0.7;   \r\n"
				+ "    }   \r\n"
				+ "  .cancelbtn {   \r\n"
				+ "        width: auto;   \r\n"
				+ "        padding: 10px 18px;  \r\n"
				+ "        margin: 10px 5px;  \r\n"
				+ "    }   \r\n"
				+ "        \r\n"
				+ "     \r\n"
				+ " .container {   \r\n"
				+ "        padding: 25px;   \r\n"
				+ "        background-color: lightblue;  \r\n"
				+ "    }   \r\n"
				+ "</style>   \r\n"
				+ "</head>    \r\n"
				+ "<body>    \r\n"
				+ "    <center> <h1>  Login Form </h1> </center>   \r\n"
				+ "    <form>  \r\n"
				+ "        <div class=\"container\">   \r\n"
				+ "            <label>Username : </label>   \r\n"
				+ "            <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>  \r\n"
				+ "            <label>Password : </label>   \r\n"
				+ "            <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>  \r\n"
				+ "            <button type=\"submit\">Login</button>   \r\n"
				+ "            <input type=\"checkbox\" checked=\"checked\"> Remember me   \r\n"
				+ "            <button type=\"button\" class=\"cancelbtn\"> Cancel</button>   \r\n"
				+ "            Forgot <a href=\"#\"> password? </a>   \r\n"
				+ "        </div>   \r\n"
				+ "    </form>     \r\n"
				+ "</body>     \r\n"
				+ "</html>  ");
		//obj.println("<body>");
		//obj.println("<head> HI </head>");
		//obj.println("</body>");
		//obj.println("</html>");
	}
}
