package datos;

public class Persona {
    private String nombre;
    private float peso;
    private float altura;



public Persona(){

    this.nombre="desconocido";
    this.peso=0.0f;
    this.altura=0.0f;

}
public Persona(String nombre, float peso, float altura) {

    this.nombre = nombre;
    this.peso=peso;
    this.altura=altura;

}


public String getNombre(){

    return nombre;

}

public float getPeso(){

    return peso;
}

public float getAltura(){

    return altura;


}

public void  setNombre(String nombre){

    this.nombre=nombre;
}

public void setPeso(float peso){

    this.peso=peso;
}

public void setAltura(float altura){

    this.altura=altura;

}

public float calcularIMC(){

    if(altura<=0||peso <= 0){

        return -1;
    }
    return peso/ (altura*altura);


}
    

}      
