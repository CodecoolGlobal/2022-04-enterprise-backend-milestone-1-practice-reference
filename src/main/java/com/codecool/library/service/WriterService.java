package com.codecool.library.service;

import com.codecool.library.dao.WriterDao;
import com.codecool.library.model.Writer;
import org.springframework.stereotype.Service;

@Service
public class WriterService {
    private final WriterDao writerDao;

    public WriterService(WriterDao writerDao) {
        this.writerDao = writerDao;
    }

    public void addWriter(Writer writer) {
        writerDao.addWriter(writer);
    }
}
