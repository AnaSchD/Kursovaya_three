package skypro.com.kursovaya_three.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import skypro.com.kursovaya_three.model.Question;
import skypro.com.kursovaya_three.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping ("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable("amount") Integer amount) {
        return examinerService.getQuestions(amount);
    }
}
