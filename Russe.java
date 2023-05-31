package poo1;

public class Russe {

    public static int ruse(int a, int b)
    {
        /*//Inmultirea a la russe;
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        String line = null;
        line = reader.readLine();
        String[] nos = line.split(",");


        int a = Integer.parseInt(nos[0]);
        int b = Integer.parseInt(nos[1]);*/


        int R = 0;

        while (a != 0) {
            if (a % 2 == 1)
                R = R + b; //adunarea termenilor b impari


            a = a / 2;
            b = b * 2;
        }

        return R;
    }
}