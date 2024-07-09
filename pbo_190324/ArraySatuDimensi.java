
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class ArraySatuDimensi {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i;
        int n;
        int jum, max, min;
        int imax, imin;
        float rata;
        
        System.out.print("Masukkan Banyak Data : ");
        n = in.nextInt();//Menjadi ukuran array
        int[] A = new int[n];//buat array A dengak ukuran n
        
        //isi array A
        //System.out.println("\n**Mengisi Array A");
        for(i=0;i<=n-1;i++)
        {
            //System.out.print("Array["+i+"] = ");
            //A[i] = in.next.Int();
          A[i] = rand.nextInt(100)+1;
        }
        //proses isi array
        jum = A[0];
        max = A[0]; imax = 0;
        min = A[0]; imin = 0;
        for(i=1;i<=n-1;i++)
        {
          jum = jum + A[i];
          if(A[i]>max)
          {
            max = A[i];
            imax = i;
          }
          if(A[i]<min)
          {
            min = A[i];
            imin = i;
          }
          
        }
        rata = (float)jum/n;
        //menampilkan isi array A
        System.out.println("*Menampilkan Isi Array A*");
        for(i=0;i<n;i++)
        {
          System.out.println(A[i]+"\t");
        }
        //menampilkan isi array A
        System.out.println("*Menampilkan Isi Array yang ganjil*");
        for(i=0;i<n;i++)
        {
          if(A[i]%2!=0)
              System.out.print(A[i]+"\t");
          //endif
        }
        //menampilkan isi Array A
        System.out.println("\n***Menampilkan isi Array A pada indeks ganjil");
        for(i=0;i<n;i++)
        {
          if(i%2!=0)
              System.out.print(A[i]+"\t");
          //endif
        }
        System.out.println("\nJumlah        = "+jum);
        System.out.println("Rata Rata   ="+rata);
        System.out.println("Nilai terbesar ="+max+" pada indeks "+max);
        System.out.println("Nilai terkecil ="+min+" pada indeks "+min);
        
    }
}


