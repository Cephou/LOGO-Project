package Exception;

public class OutOfRangeAgeTeacherException extends Exception {
    public OutOfRangeAgeTeacherException() {
        System.out.println("Exception : l'âge doit être compris entre 20 et 70 ans.");
    }
}