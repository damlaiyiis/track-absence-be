package me.damla.trackabsence.controller;

import me.damla.trackabsence.model.Lecture;
import me.damla.trackabsence.service.LectureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //json tipinde veri bekler json tipinde veri döner
@RequestMapping("/lecture") //contollerın hangi endpoint için çalışacağını belirtir.
public class LectureController {

    private LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping
    public List<Lecture> getAllLectures() {
        return lectureService.getAll();
    }

    @GetMapping("/{id}")
    public Lecture getLecture(@PathVariable Long id) {
        return lectureService.get(id);
    }

    @PostMapping //post isteğini alıcak
    public Lecture createLecture(@RequestBody Lecture lecture) { //requestbody gelen isteğin json tipindeki bodysini java nesnesine çeviriyor
        return lectureService.create(lecture);
    }

    @PatchMapping //kısmi güncelleme
    public Lecture updateLecture(@RequestBody Lecture lecture) {
        return lectureService.update(lecture);

    }

    @DeleteMapping("/{id}")
    public String deleteLecture(@PathVariable Long id) {
        return lectureService.delete(id);
    }
}
