// 

public class code {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] sequence = {3, 15, 8};

        boolean IsValidate = validationSequence(array, sequence);
        
        System.out.println("Is valid Sequence ? " + IsValidate);
    }
    static boolean validationSequence(int[] array, int[] sequence){
        int arrIdx = 0;
        int seqIdx = 0;

        while(arrIdx < array.length && seqIdx < sequence.length){
                if (array[arrIdx] == sequence[seqIdx]){
                    seqIdx += 1;
                }
                arrIdx += 1;
        }
        return (seqIdx == sequence.length);
    }
}
