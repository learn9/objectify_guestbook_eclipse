package com.example.guestbook;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Objectify_guestbook_eclipseServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
