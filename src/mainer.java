public class mainer {

    public static void main(String[] args){

        RedBlackTree<Integer> jeff = new RedBlackTree<Integer>();
        jeff.insert(23);
        jeff.insert(7);
        jeff.insert(41);
        jeff.insert(13);


        System.out.println(jeff.toString());
    }
}
