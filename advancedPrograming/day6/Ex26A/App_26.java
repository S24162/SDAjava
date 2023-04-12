package pl.sdacademy.java.advancedPrograming.day6.Ex26A;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App_26 {
    public static void main(String[] args) {
        App_26 app26 = new App_26();

    }

    public List<String> modelsList(Set<Manufacturer> manufacturers) {

        List<String> listM = manufacturers.stream()
                .flatMap(m->m.models.stream())
                .map(m->m.name)
                .collect(Collectors.toList());
        return listM;
    }
}
