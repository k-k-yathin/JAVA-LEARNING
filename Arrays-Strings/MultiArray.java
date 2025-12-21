public class MultiArray {
    public static void main(String[] args) {
        //can be two-dimensional or Three-Dimensional
        // an array of arrays
        // 2-dimensional array can have a max of 12 elements
        //Declaring Multi-Dimensional Array
        int[][] marks=new int[2][3];

        // Assigning Multi-Dimensional Array:
        marks[0][0]=10;
        marks[0][1]=20;
        marks[0][2]=30;
        marks[1][0]=40;
        marks[1][1]=50;
        marks[1][2]=60;

        int[][] marks1 = {{1,2,3},{4,5,6}};

        for(int i =0;i<marks1.length;i++){
            for(int j =0;j<marks1[i].length;j++){
                System.out.print(marks1[i][j]+" ");
            }
        }
    }
}
