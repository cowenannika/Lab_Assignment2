public class Two_Sum{
    public int[] TwoSum(int[] num, int sum){
        int add1, add2;
        int[] sol = {-1,-1};


        for(int i=0; i<num.length-1; i++){
            add1= num[i];
            for(int j=1; j<num.length; j++){
                add2=num[j];
                if(add1+add2==sum){
                    sol[0]=i;
                    sol[1]=j;
                    return sol;
                }
            }
        }
        return sol;
    }
    void printArray(int[] num){
        for(int i=0; i < num.length; i++)
            System.out.print(num[i]+" ");
        System.out.println();
    }

    void printSol(int[] sol){
        System.out.print("["+sol[0]+","+sol[1]+"]");
        System.out.println();
    }


    public static void main(String[] args){
        Two_Sum add = new Two_Sum();

        int[] arr = {2,12,8,7};
        System.out.println("Here is the given array: ");
        add.printArray(arr);

        System.out.print("Sum found at index: ");
        add.printSol(add.TwoSum(arr, 9));

    }
}
