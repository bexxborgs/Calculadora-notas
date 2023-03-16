public class Media {
    private int nota;
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public static void main (String [] args){
        double nota1 = 6;
        int nota2 = 5;
        int nota3= 7;
        double nota4= 9;

        nota1 = (nota1/4);
        nota2 = (nota2/4);
        nota3 = (nota3/4);
        nota4 = (nota4/4);

        System.out.println("Média nota 1:" + nota1);
        System.out.println("Média nota 2:" + nota2);
        System.out.println("Média nota 3:" + nota3);
        System.out.println("Média nota 4:" + nota4);







    }

}
