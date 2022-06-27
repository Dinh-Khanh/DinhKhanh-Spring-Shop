package com.ledinhkhanhweb.api.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ledinhkhanhweb.model.ProductModel;
import com.ledinhkhanhweb.service.IProductService;

@WebServlet(urlPatterns = { "/api-product" })
public class ProductAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IProductService productService;
	private String[] categoryIds;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		categoryIds = req.getParameterValues("categoryid");
		List<ProductModel> listProductModel = new ArrayList<ProductModel>();
		for (String categoryId : categoryIds) {
			listProductModel.addAll( productService.findByCategoryId(Long.parseLong(categoryId)));
		}
		ObjectMapper mapper = new ObjectMapper();
		resp.addHeader ("Access-Control-Allow-Origin", "*");
		mapper.writeValue(resp.getOutputStream(), listProductModel);
	}
}
