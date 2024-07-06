package com.example.Controller;



	

	
	import com.example.entity.Quiz;
    import com.example.service.QuizService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;

	@Controller
	@RequestMapping("/quiz")
	public class QuizController {

	    @Autowired
	    private QuizService quizService;

	    @GetMapping("/create")
	    public String showCreateQuizForm(Model model) {
	        model.addAttribute("quiz", new Quiz());
	        return "create_quiz";
	    }

	    @PostMapping("/create")
	    public String createQuiz(@ModelAttribute("quiz") Quiz quiz) {
	        quizService.createQuiz(quiz);
	        return "redirect:/quiz/" + quiz.getId();
	    }

	    @GetMapping("/{id}")
	    public String showQuizDetails(@PathVariable("id") Long id, Model model) {
	        Quiz quiz = quizService.getQuizById(id);
	        if (quiz == null) {
	            // Handle not found scenario
	            return "redirect:/quiz/create"; // Redirect to create page or handle appropriately
	        }
	        model.addAttribute("quiz", quiz);
	        return "quiz_details";
	    }

	    @PostMapping("/{id}/update")
	    public String updateQuiz(@PathVariable("id") Long id, @ModelAttribute("quiz") Quiz quiz) {
	        quiz.setId(id); // Ensure the ID is set
	        quizService.updateQuiz(quiz);
	        return "redirect:/quiz/" + id;
	    }

	    @GetMapping("/{id}/delete")
	    public String deleteQuiz(@PathVariable("id") Long id) {
	        quizService.deleteQuiz(id);
	        return "redirect:/quiz/create"; // Redirect to a suitable page
	    }

	    // Other mappings for quiz list, quiz taking, etc.
	}


