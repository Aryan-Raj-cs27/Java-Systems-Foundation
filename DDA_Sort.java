import java.util.*;
class DDA_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix Order ' n>3 to n<10 ' : ");
        int N = sc.nextInt();
        if(N>3 && N<10)
        {
            int m [][] = new int[N][N];
            int SDA[] = new int[N*N];
            int i,j,s=0,temp;
            System.out.println("Enter positive integer for matrix : ");
            for(i=0;i<N;i++)
            {
                for(j=0;j<N;j++)
                {
                    m[i][j] = sc.nextInt();
                    SDA[s] = m[i][j];
                    s++;
                }
            }
            System.out.println("Before Sorting :");
            for(i=0;i<N;i++)
            {
                for(j=0;j<N;j++)
                {
                    System.out.print(m[i][j]+"\t");
                }
                System.out.println("");
            }
            for(i=0;i<(N*N);i++)
            {
                for(j=0;j<(N*N)-1;j++)
                {
                    if(SDA[j]<SDA[j+1])
                    {
                        temp = SDA[j];
                        SDA[j] = SDA[j+1];
                        SDA[j+1] = temp;
                    }
                }
            }
            System.out.println("After Sorting :");
            s = 0;
            for(i=0;i<N;i++)
            {
                for(j=0;j<N;j++)
                {
                    m[i][j] = SDA[s];
                    s++;
                    System.out.print(m[i][j]+"\t");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}