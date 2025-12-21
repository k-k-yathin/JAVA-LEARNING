public class Arrays {
    public static void main(String[] args) {
        // non-primitive data type which stores similar data types
        // Declaring an array
        int[] marks = new int[5];

        //Assigning elements to an array :
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;

        //Initializing an array:
        int[] marks1 = {10,20,30,40,50};

        //for loop
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        //for-each loop
        for(int value : marks1){
            System.out.println(value);
        }
    }
}
