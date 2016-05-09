import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.AuthenticationController;
import controller.Controller;
import controller.LoginController;
import controller.LogoutController;
import controller.NotFoundController;
import controller.ProfileController;

public class FrontControllerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		Controller controller = null;
		String path = req.getRequestURI();
		if (path.equals("/MVC/")) {
			HttpSession session = req.getSession(false);
			
			if (session != null && session.getAttribute("username") != null)
				controller = new ProfileController();
			else
				controller = new LoginController();
			
		}
		else {
			controller = new NotFoundController();
		}
		
		controller.execute(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		Controller controller = null;
		String path = req.getRequestURI();
		if (path.equals("/MVC/login")) {
			controller = new AuthenticationController();
		}
		else if (path.equals("/MVC/logout")) {
			controller = new LogoutController();
		}
		else {
			controller = new NotFoundController();
		}
		
		controller.execute(req, res);
	}
	
	

}
