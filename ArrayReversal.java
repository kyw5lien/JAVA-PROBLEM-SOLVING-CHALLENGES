/**
 *  An ArrayReversal Class containing array reversal algorithms.
 * @author kyw5lien
 */
public class ArrayReversal{
	public static void decrementingForLoopReverse(int[] array){
		if(array.length !=0 && array.length !=1){
			int aux = 0;
			int j = 0;
			for(int i=array.length-1; i>array.length/2; i--){
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				j++;
			}
		}
	}
}
