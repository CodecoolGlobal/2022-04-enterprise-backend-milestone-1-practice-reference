package com.codecool.library.dao;

import com.codecool.library.model.Writer;

import java.util.List;

public interface WriterDao {
    void addWriter(Writer writer);
    List<Writer> listWritersByBirthPlace(String birthPlace);
}
