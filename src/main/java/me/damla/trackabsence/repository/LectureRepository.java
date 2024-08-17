package me.damla.trackabsence.repository;

import me.damla.trackabsence.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
    Lecture findByLectureCode(int lectureCode);
}
