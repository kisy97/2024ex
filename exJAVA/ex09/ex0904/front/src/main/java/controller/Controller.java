package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Controller {
	Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
