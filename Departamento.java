public class Departamento implements Comparable<Departamento>{
    String nombre;
    int empleados;
    public Departamento(String nombre, int empleados){
        this.nombre = nombre;
        this.empleados = empleados;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEmpleados(){
        return this.empleados;
    }
    @Override
    public int compareTo(Departamento dep) {
        if(this.empleados - dep.empleados == 0){
            return this.nombre.compareTo(dep.nombre);
        }
        return this.empleados - dep.empleados;
    }
    public String toString(){
        return "Nombre: "+this.nombre+", Empleados: "+this.empleados;
    }
}
