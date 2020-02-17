import java.util.ArrayList;

class CL {

private ArrayList<Lab> labs;//code, name, cap, curso
private int labs_index;

private ArrayList<Stu> stus;//code, name, cap, curso
private int stu_index;

private ArrayList<Curso> cursos;//code, name, cap, curso
private int cursos_index;

public CL() {
  labs = new ArrayLists();
  labs_index = 0;
  stus = new ArrayLists();
  stu_index = 0;
  cursos = new ArrayLists();
  cursos_index = 0;
 }
public void registrarLab(String codigo, String nombre, int capacidad, String curso) {
 Lab newlab = new Lab();
 newlab.setCodigo(codigo);
 newlab.setName(nombre);
 newlab.setCapac(capacidad);
 newlab.setCurso(curso);
 labs.add(newlab);
 labs_index++;
 }
public void registrarStu(String pnombre, String papell1, String papell2, String pid, String pgen, LocalDate pbirth,boolean pesbecado) {
 Stu newstu = new Stu();
 newstu.setName(pnombre);
 newstu.setApe1(papell1);
 newstu.setApe2(papell2);
 newstu.setID(pid);
 newstu.setGen(pgen);
 newstu.setBirth(pbirth);
 newstu.setEsBecado(pesbecado);

 stus.add(newstu);
 stu_index++;
 }
public void registrarCurso(String pcode, String pname, int pcant_cred) {
 Curso newcurso = new Curso(pcode, pname, pcant_cred);

 cursos.add(newcurso);
 cursos_index++;
 }
public String[] bulk() {
 String[] data = new String[labs.length];
 for (int i = 0; i < CL.labs.length; i++)
 {data[i] = labs[i].toString();}
 return data;
 }
}