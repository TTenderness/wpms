package com.wpms.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wpms.model.Project;
import com.wpms.model.User;
import com.wpms.service.ProService;
import com.wpms.serviceImpl.ProServiceImpl;

public class CardelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<Integer, Integer> procar = (Map<Integer, Integer>) request.getSession().getAttribute("procar");
		String idString = request.getParameter("proid");
		User user = (User) request.getSession().getAttribute("user");
		String urlPath = "cart.jsp";
		Integer proid = Integer.parseInt(idString);
		ProService service = new ProServiceImpl();
		if (procar.size() > 0) {
			procar.remove(proid);
			service.delFromCar(user.getUserid(), proid);
			if (procar.size() == 0) {
				urlPath = "index.jsp";
			} else {
				List<Project> list = service.getPros(procar.keySet());
				for (Project pro : list) {
					pro.setBuycount(procar.get(pro.getProid()));
				}
				request.setAttribute("list", list);
			}
		}
		request.getRequestDispatcher(urlPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
