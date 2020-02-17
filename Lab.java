public class Lab {
 //Atributos del objeto
 //<protected> por defecto en los objetos. Para todos los archivos en el mismo directorio, protected funciona como public.
 // Modificador de acceso o Identificador de acceso <public><protected><private>
 // Metodos de acceso <Sett&Getter>
 //<public>. Para todos los archivos del mismo paquete.
 //<private>. Sin acceso.
 // Por cada atributo modificable, se necesita un metodo SET <public> que pueda modificar el valor y un GET <public> para devolver el valor
private String code;
private String name;
private String curso;
private int capacity;
//SettersANDGetter 
 public void setCodigo(String value) { this.code = value;}
 public String getCodigo() {
 return this.code;
 }
 public void setName(String value) { this.name = value ;}
 public String getName() {
 return this.name;
 }
 public void setCurso(String value) { this.curso = value ;}
 public String getCurso() {
 return this.curso;
 }
 public void setCapac(int value) { this.capacity = value ;}
 public int getCapac() {
 return this.capacity;
 }
//Constructor
 public Lab() {}
 public Lab(String pcode, String pname, String pcurso, int pcapacity) {
 this.code = pcode;
 this.name = pname;
 this.curso = pcurso;
 this.capacity = pcapacity;
 }
//to String
 public String toString() {
   return this.getCodigo()+","+this.getName()+","+this.getCurso()+","+this.getCapac();
   }
}