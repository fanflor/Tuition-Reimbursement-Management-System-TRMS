package Repository;


import models.grades;

import java.util.List;

public interface gradesRepo {
    public grades addGrades(grades one);
    public List<grades> getAllGrades();
    public grades getGradesById(int id);
    public grades updateGrades(grades change);
    public grades deleteGrades(int id);


}
