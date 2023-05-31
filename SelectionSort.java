package poo1;

public class SelectionSort {
    void selSort(int A[]) {
        int n = A.length;


        for (int i = 0; i < n - 1; i++) {

            int minj = i;
            int minx=A[i];
            for (int j = i + 1; j < n; j++)
                if (A[j] < minx) {
                    minj = j;
                    minx = A[j];
                }


            A[minj] = A[i];
            A[i] = minx;
        }
    }
        static void showVector( int A[])
        {

            for (int i = 0; i < A.length; ++i)
                System.out.print(A[i] + " ");

            System.out.println();
        }
    }
