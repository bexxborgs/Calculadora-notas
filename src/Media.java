public class Media {
    private int nota;
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public static void main (String [] args){
        double nota1 = 6.5;
        double nota2 = 5.5;
        double nota3= 7;
        double nota4= 9;

        double nota5 = (nota1 + nota2 + nota3 + nota4);
        double nota6 = (nota5 / 4);

        System.out.println("Soma notas :" + nota5);
        System.out.println("Media notas :" + nota6);

    }

}
