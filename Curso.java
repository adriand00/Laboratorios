class Curso {
  /*
  codigo
  nombre 
  cantidad de creditos

  dos contructores , getsetters, toString
  */
private String code;
private String name;
private int cant_cred;

//Setters&Getters
 public void setCodigo(String value) { this.code = value; }
 public String getCodigo() { return this.code; }

 public void setName(String value) { this.name = value; }
 public String getName() { return this.name; }
 
 public void setCapac(int value) { this.cant_cred = value ;}
 public int getCapac() { return this.cant_cred; }
//Constructor
 public Curso() {}
 public Curso(String pcode, String pname, int pcant_cred) {
 this.code = pcode;
 this.name = pname;
 this.cant_cred = pcant_cred;
 }
//to String
 public String toString() {
   return this.getCodigo()+","+this.getName()+","+this.getCapac();
   }
}