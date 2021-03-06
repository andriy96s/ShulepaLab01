package sorters;

/**
 * Realisation of {@link BubbleSort} abstract class that allows sort array via Bubble Sort from end.
 *
 * @author Andriy Shulepa
 */
public class FromEndBubbleSort extends BubbleSort {
    @Override
    protected int getOuterStartIndex() {
        return 0;
    }

    @Override
    protected boolean canOuterMoveNext(int i) {
        return i < length;
    }

    @Override
    protected int iterateOuter(int i) {
        return ++i;
    }

    @Override
    protected int getInnerStartIndex() {
        return length - 1;
    }

    @Override
    protected boolean canInnerMoveNext(int j, int i) {
        return j > i;
    }

    @Override
    protected int iterateInner(int j) {
        return --j;
    }

    @Override
    protected boolean needToSwap(int[] arr, int j) {
        return arr[j] < arr[j - 1];
    }

    @Override
    protected int getSecondIndexToSwap(int j) {
        return j - 1;
    }
}
