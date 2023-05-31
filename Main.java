package poo1;
public class Main
{   public static void main(String[] args) {



    System.out.println("---------------------EX1: INSERTION SORT---------------------\n");



    int A[] = { 12, 11, 13, 5, 6 };
    System.out.println("VECTORUL INITIAL: ");


    for(int i=0;i<A.length;i++)
    {

        System.out.print(A[i] + " ");
    }
    System.out.println();

    InsertionSort ob = new InsertionSort();
    ob.sortVector(A);
    System.out.println("VECTORUL SORTAT: ");
    InsertionSort.printVector(A);

    System.out.println("\n\n\n");

    System.out.println("---------------------EX2: SELECTION SORT---------------------\n");

    int B[] = { 12, 1, 163, 5, 6 };
    System.out.println("VECTORUL INITIAL: ");


    for(int i=0;i<B.length;i++)
    {

        System.out.print(B[i] + " ");
    }



    SelectionSort obj = new SelectionSort();
    obj.selSort(B);
    System.out.println("VECTORUL SORTAT: ");
    SelectionSort.showVector(B);
    System.out.println("\n\n\n");

    System.out.println("---------------------EX3: ALG LUI EUCLID---------------------\n");
    int a = 10, b = 15, g;
    g = Euclid.euclid(a, b);
    System.out.println("cmmdc(" + a + " , " + b
            + ") = " + g);
    System.out.println("\n\n\n");




    System.out.println("---------------------EX4: ALG LUI FIBONACCI---------------------\n");
    int n1=5,r,r1;
    r=Fibonacci.fibo_r(n1);
    System.out.println("=======VARIANTA RECURSIVA========");
    System.out.println("Termenul nr  " + n1 + " al sirului lui fibonacci este " + r);
    System.out.println("=======VARIANTA ITERATIVA========");
    r1=Fibonacci.fibo_i(n1);
    System.out.println("Termenul nr  " + n1 + " al sirului lui fibonacci este " + r1);
    System.out.println("\n\n\n");




    System.out.println("---------------------EX5:INMULTIREA A LA RUSSE---------------------\n");
    int c=70,d=15;
    int f = Russe.ruse(c, d);

    System.out.println("Inmultirea numerelor " + c + " si " + d + " este = " + f );
    System.out.println("\n\n\n");





    System.out.println("---------------------EX5:INMULTIREA A DOUA MATRICI---------------------\n");
    int m1[][]={{1,2,3},{4,5,6},{2,3,4}};
    int m2[][]={{3,4,5},{1,2,3},{4,3,2}};

    System.out.println("--------------------------");
    System.out.println("m1= ");

    for(int i=0;i<m1.length;i++) {
        for (int j = 0; j < m1[0].length; j++) {
            System.out.print(m1[i][j] + "\t");

        }
        System.out.println();
    }

    System.out.println("--------------------------");
    System.out.println("m2=");
    for(int i=0;i<m2.length;i++) {
        for (int j = 0; j < m2[0].length; j++) {
            System.out.print(m2[i][j] + "\t");

        }
        System.out.println();
    }

    System.out.println("--------------------------");
    System.out.println("m= ");
    Inmultire_mat.matInm(m1,m2);





}
}
