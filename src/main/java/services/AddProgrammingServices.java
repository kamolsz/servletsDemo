package services;

import com.sda.ProgrammingLanguage;

import java.util.LinkedList;
import java.util.List;

public class AddProgrammingServices {

    static LinkedList <ProgrammingLanguage> listOfProgrammingLanguages = new LinkedList<>();



    public static void addNewLanguage(ProgrammingLanguage programmingLanguage) {
        listOfProgrammingLanguages.add(programmingLanguage);
    }

    public static void viewWholeListOfProgrammingLanguages() {
        for (Object p : listOfProgrammingLanguages) {
            System.out.println(p);
        }


    }

}
