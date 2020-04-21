package app.controller;


import app.model.Words;
import app.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class WordsController {

    @Autowired
    private WordsRepository repository;

    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping("/words")
    public ResponseEntity<List<Words>> words(){
        List<Words> words = repository.findAll();
        return new ResponseEntity<>(words, HttpStatus.OK);
    }

    @GetMapping("/html/words")
    public String accountTemplate(Model model){
        List<Words> words = repository.findAll();
        model.addAttribute("words", words);
        return "words";
    }

}
