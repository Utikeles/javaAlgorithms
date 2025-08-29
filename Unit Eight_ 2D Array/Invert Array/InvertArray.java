public class InvertArray{

    public static void main(String[] args) {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    printArray(arr);
    printArray(invert(arr));
    }
    
    public static int[][] invert(int[][] arr) {

    int rows = arr.length;
    int cols = arr[0].length;
    int[][] arr2 = new int[cols][rows];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            arr2[j][i] = arr[i][j];
        }
    }
    return arr2;
    }

    public static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int x : i) {
                System.out.print(x+", ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}

