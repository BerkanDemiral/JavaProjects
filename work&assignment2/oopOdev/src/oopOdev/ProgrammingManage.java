package oopOdev;

public class ProgrammingManage {
    public void changeName(Programming programming, String newProgrammingName){
        programming.name = newProgrammingName;
    }
    public void joinToCourse(Programming programming){
        System.out.println(programming.name+ " Kursuna Katılımınız Onaylandı. ");
    }

}
