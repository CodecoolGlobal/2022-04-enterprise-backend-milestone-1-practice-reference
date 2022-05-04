package com.codecool.library.controller;

import com.codecool.library.model.Writer;
import com.codecool.library.service.WriterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/writer")
public class WriterController {
    private WriterService writerService;

    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }

    @PostMapping
    public void addWriter(@RequestBody Writer writer) {
        writerService.addWriter(writer);
    }
}