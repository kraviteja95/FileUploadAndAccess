package com.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> file = sf.parseRequest(request);

			for (FileItem item : file) {
				item.write(new File("C:/Ravi_Practice/FileUploadFromUI/" + item.getName()));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The file is uploaded successfully..... :):):)");
	}
}
