package com.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
/**
 * Servlet implementation class Bct
 */
@WebServlet("/Bct")
//public class Bct extends HttpServlet {
public class Bct implements Serializable {
	private static final long serialVersionUID = 1L;
    
	private int id;
	private String question;
	private int questiontype;
	private String questionpoint;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bct() {
        super();
        this.questiontype = 3;
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	/**
	 * @param question 题目题干
	 * @param questiontype 题目类型（编程题）
	 * @param questionpoint 题目知识点
	 */
    
    public Bct(String question,  String questionpoint) {
		super();
		this.question = question;
		this.questiontype = 3;
		this.questionpoint = questionpoint;
	}
    
    public String toString() {
		return "Bct [id=" + id + ", question=" + question + ", questiontype=" + questiontype + ", questionpoint="
				+ questionpoint + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	public String getQuestionpoint() {
		return questionpoint;
	}
	public void setQuestionpoint(String questionpoint) {
		this.questionpoint = questionpoint;
	}
 /*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
*/
}
