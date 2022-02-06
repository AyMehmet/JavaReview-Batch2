package Lambda;

public class ArraySorting {

    public static void main(String[] args) {

       ArraySorting as=new ArraySorting();

       QuickSort quickSort=new QuickSort();
       BubbleSort bubbleSort=new BubbleSort();

       as.sort(quickSort);
       as.sort(bubbleSort);

       MyLambda myLambda=() -> System.out.println(" Array Sorting");


    }

    void sort(Sorting sorting){

        sorting.sort();
        //System.out.println("Arraysorting");
    }

    interface MyLambda{

        void print();

    }
}
