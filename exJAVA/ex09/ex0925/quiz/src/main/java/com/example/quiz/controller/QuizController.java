package com.example.quiz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.quiz.entity.Quiz;
import com.example.quiz.form.QuizForm;
import com.example.quiz.service.QuizService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;







@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	QuizService service;
	
	@ModelAttribute
	public QuizForm setUpForm() {
		QuizForm form = new QuizForm();
		form.setAnswer(true);
		return form;
	}
	
	@GetMapping
	public String showList(QuizForm quizForm, Model model) {
		quizForm.setNewQuiz(true);
		
		Iterable<Quiz> list = service.selectAll();
		
		model.addAttribute("list", list);
		model.addAttribute("title", "등록 폼");
		
		return "crud";
	}
//	quiz 데이터를 1건 등록
	@PostMapping("insert")
	public String insert(@Validated QuizForm quizForm, BindingResult bindingResult,
			Model model, RedirectAttributes redirectAttributes) {
		//TODO: process POST request
		Quiz quiz = new Quiz();
		quiz.setQuestion(quizForm.getQuestion());
		quiz.setAnswer(quizForm.getAnswer());
		quiz.setAuthor(quizForm.getAuthor());
		
		if (!bindingResult.hasErrors()) {
			service.insertQuiz(quiz);
			redirectAttributes.addFlashAttribute("complete", "등록이 완료되었습니다.");
			return "redirect:/quiz";
		} else {
			//에러가 발생한 경우 목록 표시로 변경
			return showList(quizForm, model);
		}
	}
	
	@GetMapping("/{id}")
	public String showUpdate(QuizForm quizForm, @PathVariable("id") Integer id, Model model) {
		Optional<Quiz> quizOpt = service.selectOneById(id);
		
		Optional<QuizForm> quizFormOpt = quizOpt.map(t -> makeQuizForm(t));
		
		if (quizFormOpt.isPresent()) {
			quizForm = quizFormOpt.get();
		}
		
		makeUpdateModel(quizForm,model);
		return "crud";
	}
	
	private void makeUpdateModel(QuizForm quizForm, Model model) {
		model.addAttribute("id", quizForm.getId());
		quizForm.setNewQuiz(false);
		model.addAttribute("quizForm", quizForm);
		model.addAttribute("title", "변경 폼");
	}
	
	@PostMapping("/update")
	public String update(@Validated QuizForm quizForm, BindingResult bindingResult,
			Model model, RedirectAttributes redirectAttributes) {
		//TODO: process POST request
		Quiz quiz = makeQuiz(quizForm);
		
		if(!bindingResult.hasErrors()) {
			service.updateQuiz(quiz);
			redirectAttributes.addFlashAttribute("complete", "변경이 완료되었습니다.");
			
			return "redirect:/quiz/" + quiz.getId();
		} else {
			makeUpdateModel(quizForm, model);
			return "crud";
		}
		
	}
	
	private Quiz makeQuiz(QuizForm quizForm) {
		Quiz quiz = new Quiz();
		quiz.setId(quizForm.getId());
		quiz.setQuestion(quizForm.getQuestion());
		quiz.setAnswer(quizForm.getAnswer());
		quiz.setAuthor(quizForm.getAuthor());
		return quiz;
	}
	
	private QuizForm makeQuizForm(Quiz quiz) {
		QuizForm form = new QuizForm();
		form.setId(quiz.getId());
		form.setQuestion(quiz.getQuestion());
		form.setAnswer(quiz.getAnswer());
		form.setAuthor(quiz.getAuthor());
		form.setNewQuiz(false);
		return form;
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id") String id,
			Model model,
			RedirectAttributes redirectAttributes) {
		//TODO: process POST request
		service.deleteQuizById(Integer.parseInt(id));
		redirectAttributes.addFlashAttribute("delcomplete", "삭제 완료했습니다.");
		return "redirect:/quiz";
	}
	
	@GetMapping("/play")
	public String showQuiz(QuizForm quizForm, Model model) {
		
		Optional<Quiz> quizOpt = service.selectOneRandomQuiz();
		
		if (quizOpt.isPresent()) {
			
			Optional<QuizForm> quizFormOpt = quizOpt.map(t -> makeQuizForm(t));
			quizForm = quizFormOpt.get();
		} else {
			model.addAttribute("msg", "등록된 문제가 없습니다.");
			return "play";
		}
		
		model.addAttribute("quizForm", quizForm);
		return "play";
	}
	
	@PostMapping("/check")
	public String chekcQuiz(QuizForm quizForm, @RequestParam("answer") Boolean answer, Model model) {
		//TODO: process POST request
		if (service.checkQuiz(quizForm.getId(), answer)) {
			model.addAttribute("msg", "정답입니다.");
		} else {
			model.addAttribute("msg", "오답입니다.");
		}
		return "answer";
	}
	
}
