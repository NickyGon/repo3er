package parcialFinal.celulares;

public class Cliente {
    public static void main(String[]args){
        iCelular celular= new Apple(3,128,126,150,"IPhone 7");
        iCelular celular2= new Samsung(4,512,160,170,"Galaxy A3");
        iCelular celular3= new Sony(3,128,140,190,"Xperia 11");

        celular.mostrarInfo();
        celular=new Carcasa(celular,50);
        celular=new MemoriaExterna(celular,120);
        celular=new VidrioTemplado(celular);


        celular.mostrarInfo();


        celular2.mostrarInfo();
        celular2=new Carcasa(celular2,50);
        celular2=new MemoriaExterna(celular2,120);
        celular2=new VidrioTemplado(celular2);


        celular2.mostrarInfo();


        celular3.mostrarInfo();
        celular3=new Carcasa(celular3,50);
        celular3=new MemoriaExterna(celular3,120);
        celular3=new VidrioTemplado(celular3);


        celular3.mostrarInfo();
    }
}
