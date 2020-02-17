import java.time.LocalDate;

class Stu {
  /*
  Nombre 
  Primer Apellido
  Segundo Apellido
  ID
  genero 
  FechadeNacimiento tipo de dato LocalDate LocalDatime (no Date, no String)
  es becado
  */
private String nombre;
private String apell1;
private String apell2;
private String id;
private String gen;
private LocalDate birth;
private boolean esbecado;
//SetterAndGetter
 public void setName(String value) { this.nombre = value;}
 public String getName() {
 return this.nombre;
 }
 public void setApe1(String value) { this.apell1 = value ;}
 public String getApe1() {
 return this.apell1;
 }
 public void setApe2(String value) { this.apell2 = value ;}
 public String getApe2() {
 return this.apell2;
 }
 public void setID(String value) { this.id = value ;}
 public String getID() {
 return this.id;
 }
 public void setGen(String value) { this.gen = value ;}
 public String getGen() {
 return this.gen;
 }
 public void setBirth(LocalDate value) { this.birth = value ;}
 public LocalDate getBirth() {
 return this.birth;
 }
 public void setEsBecado(boolean value) { this.esbecado = value ;}
 public boolean getEsBecado() {
 return this.esbecado;
 }
//Constructor
 public Stu() {}
 public Stu(String pnombre, String papell1, String papell2, String pid, String pgen, LocalDate pbirth,boolean pesbecado) {
  this.nombre = pnombre;
  this.apell1 = papell1;
  this.apell2 = papell2;
  this.id     = pid;
  this.gen    = pgen;
  this.birth  = pbirth;
  this.esbecado  = pesbecado;
 } 
//toString
 public String toString() { 
 return getName()+","+getApe1()+","+getApe2()+","+getID()+","+getGen()+","+getGen()+","+getBirth()+getEsBecado();
 }
}