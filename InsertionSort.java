package poo1;

public class InsertionSort
{
    void sortVector(int A[])
    {

        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            //inserează A[j] în secventa sortată A[i..j-1]
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    static void printVector(int A[])
    {

        for (int i = 0; i <A.length; ++i)
            System.out.print(A[i] + " ");

        System.out.println();
    }



};
