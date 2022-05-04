package com.codecool.library.dao.implementation.memory;

import com.codecool.library.dao.WriterDao;
import com.codecool.library.model.Writer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class WriterDaoMem implements WriterDao {
    private final List<Writer> writers = new ArrayList<>();

    @Override
    public void addWriter(Writer writer) {
        writers.add(writer);
    }

    @Override
    public List<Writer> listWritersByBirthPlace(String birthPlace) {
        return writers.stream().filter(writer -> writer.getBirthPlace().equals(birthPlace)).collect(Collectors.toList());
    }
}
