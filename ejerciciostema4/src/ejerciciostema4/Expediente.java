package ejerciciostema4;

public class Expediente {
//tipo enum definido para mi clase
enum Modalidad{FPB,GRADOMEDIO,GRADOSUPERIOR};

//propiedades
private static int totalAlumnado=0;
private final int id=Expediente.totalAlumnado+1;


Expediente(){
	Expediente.totalAlumnado=Expediente.totalAlumnado++;
}

public int getId() {
	return this.id;
}

}
