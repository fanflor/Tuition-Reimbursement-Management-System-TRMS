package services;

import Repository.gradesRepo;
import models.grades;

import java.util.List;

public interface gradesService {
    public grades addGrades(grades one);
    public List<grades> getAllGrades();
    public grades getGradesById(int id);
    public grades updateGrades(grades change);
    public grades deleteGrades(int id);
}
