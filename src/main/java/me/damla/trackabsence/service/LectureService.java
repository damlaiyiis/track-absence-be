package me.damla.trackabsence.service;

import lombok.RequiredArgsConstructor;
import me.damla.trackabsence.model.Lecture;
import me.damla.trackabsence.repository.LectureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final LectureRepository lectureRepository;

    public List<Lecture> getAll() {
        return lectureRepository.findAll(); //bütün lecture satırlarını dönüyor.
    }

    public Lecture get(Long id) {
        return lectureRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Lecture create(Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    public Lecture update(Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    public String delete(Long id) {
        lectureRepository.deleteById(id);
        return "Deleted lecture";
    }

}
