public class TesteEmpregado{
public static void main (String [] args){
Empregado e1 = new Empregado ();
Empregado e2 = new Empregado();
Empregado e3 = new Empregado ();
//e agora, como configurar o tipo deles?

public class TesteEmpregado{
public static void main (String [] args){
Empregado e1 = new Empregado ();
Empregado e2 = new Empregado();
Empregado e3 = new Empregado ();
//configurando tipo dos empregados
e1.setTipo(1);
e2.setTipo(2);
e3.setTipo(3);
//configurando alguns valores
e1.setSalario(2000);
}
}