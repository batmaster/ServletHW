package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

public class AuthenticationController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession(false);
		if (User.authenticate(username, password) != null) {
			session.setAttribute("username", username);
			session.setAttribute("failed", null);
		}
		else {
			session.setAttribute("failed", "yes");
		}
		
		res.sendRedirect("/MVC/");
	}

}
