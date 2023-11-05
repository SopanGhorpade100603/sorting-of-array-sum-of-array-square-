public class sumofarrayusingsorting {
    public static void dec(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    // Swap
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    public static void printnum(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static int printsum(int num[]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println();
        return sum;
    }
    public static void printsquare(int num[]){
        int square=0;
        for(int i=0;i<num.length;i++){
            square= num[i] * num[i];
            System.out.print(square+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]= {3,6,2,1,8,7,4,5};
        dec(num);
        printnum(num);
        int sum=printsum(num);
        System.out.println("sum of array is "+sum);
        printsquare(num);
    }
}

