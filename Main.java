import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Departamento> departamentos = new ArrayList<>();
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Informática",4);
        Departamento d2 = new Departamento("Contabilidad",7);
        Departamento d3 = new Departamento("Márketing",4);
        Departamento d4 = new Departamento("Logística",8);
        Departamento d5 = new Departamento("Internacional",2);
        departamentos.add(d1);
        departamentos.add(d2);
        departamentos.add(d3);
        departamentos.add(d4);
        departamentos.add(d5);
        System.out.println("Departamentos sin ordenar");
        for(Departamento dep: departamentos){
            System.out.println(dep);
        }
        System.out.println("---------------");
        Collections.sort(departamentos);
        System.out.println("Departamentos ordenados");
        for(Departamento d: departamentos){
            System.out.println(d);
        }
    }
}
