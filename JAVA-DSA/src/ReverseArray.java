import java.util.Arrays;
public class ReverseArray {
    public void Reverse(){
    int[] Arr= {1,2,3,4};
    int ReverseArr[] = new int[4];
    int j=0;

    for(int i=Arr.length-1; i>=0; i--)
    {
        ReverseArr[j]=Arr[i];
        j=j+1;
    }

    System.out.println("Reversed Array:" + Arrays.toString(ReverseArr));
}
}
