public class MaxValueInMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int max = array[0][0];
        for (int i =0 ; i < 3;i++){
            for (int j = 0 ;j<3;j++){
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        System.out.println("Max value in Array :" +max);
    }

}
