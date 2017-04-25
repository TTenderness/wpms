package com.wpms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.wpms.service.UserService;
import com.wpms.serviceImpl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service = new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String urlPath = "register.jsp";
		String msg = null;
		try {
			SmartUpload smu = new SmartUpload();
			smu.initialize(this.getServletConfig(), request, response);
			smu.setAllowedFilesList("gif,jpg,png,bmp");
			smu.setMaxFileSize(100 * 1024); // �����ļ��������Ϊ100K
			smu.setCharset("utf-8");

			smu.upload();
			String uname = smu.getRequest().getParameter("username");
			String upwd = smu.getRequest().getParameter("userpwd");
			String urole = smu.getRequest().getParameter("userrole");
			String usex = smu.getRequest().getParameter("usersex");
			String umail = smu.getRequest().getParameter("usermail");
			File file = smu.getFiles().getFile(0);
			if (file.getFileExt().equals("") || file.getFileExt() == null) {
				throw new Exception();
			}
			if (uname != null && uname != "") {
				boolean result = service.checkUsername(uname);
				if (result) {
					msg = "�û����Ѿ�����";
				} else {
					int i = service.register(uname, upwd, urole, usex, umail);
					file.saveAs("D:/img/" + uname + "." + file.getFileExt());
					if (i > 0) {
						msg = "ע��ɹ�,";
						urlPath = "index.jsp";
					} else {
						msg = "ע��ʧ��";
					}
				}
			} else {
				msg = "�û�������Ϊ��";
			}
		} catch (SmartUploadException e) {
			msg = "�ϴ�ʧ�ܣ�����ϵ����Ա��";
		} catch (Exception e) {
			msg = "���ϴ�ͷ��";
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(urlPath).forward(request, response);

	}

}
