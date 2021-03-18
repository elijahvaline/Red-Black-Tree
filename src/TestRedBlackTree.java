import org.junit.Assert;
import org.junit.Test;


public class TestRedBlackTree {

    /**
     * This tests the RB condition that the root needs to be black.
     */
    @Test
    public void caseOneTest(){

        RedBlackTree<Integer> jeff = new RedBlackTree<Integer>();
        jeff.insert(5);
        Assert.assertEquals(true, jeff.root.isBlack);

    }

    /**
     * Tests the second RB condition for when the uncle of the new node is red. It also tests
     * the positions of the nodes
     */
    @Test
    public void caseTwoTest(){

        RedBlackTree<Integer> jeff = new RedBlackTree<Integer>();
        jeff.insert(10);
        jeff.insert(15);
        jeff.insert(5);
        jeff.insert(1);
        Assert.assertEquals(true, jeff.root.leftChild.isBlack);
        Assert.assertEquals(true, jeff.root.isBlack);
        Assert.assertEquals(true, jeff.root.rightChild.isBlack);
        Assert.assertEquals(false, jeff.root.leftChild.leftChild.isBlack);
        Assert.assertEquals("[10, 5, 15, 1]", jeff.root.toString());

    }

    /**
     * Tests the rotations and the colors for when the newly added nodes are both left children creating
     * and unbalenced tree.
     */
    @Test
    public void caseThreeTest(){

        RedBlackTree<Integer> jeff = new RedBlackTree<Integer>();
        jeff.insert(15);
        jeff.insert(10);
        jeff.insert(20);
        jeff.insert(5);
        jeff.insert(1);
        Assert.assertEquals(true, jeff.root.isBlack);
        Assert.assertEquals(true, jeff.root.leftChild.isBlack);
        Assert.assertEquals(true, jeff.root.rightChild.isBlack);
        Assert.assertEquals(false, jeff.root.leftChild.rightChild.isBlack);
        Assert.assertEquals(false, jeff.root.leftChild.leftChild.isBlack);
        Assert.assertEquals("[15, 5, 20, 1, 10]", jeff.root.toString());

    }

    /**
     * Tests the rotations and color changes after inserts where one is a left child, and the other is a
     * right child.
     */
    @Test
    public void caseFourTest(){

        RedBlackTree<Integer> jeff = new RedBlackTree<Integer>();
        jeff.insert(15);
        jeff.insert(10);
        jeff.insert(20);
        jeff.insert(5);
        jeff.insert(7);
        Assert.assertEquals(true, jeff.root.isBlack);
        Assert.assertEquals(true, jeff.root.leftChild.isBlack);
        Assert.assertEquals(true, jeff.root.rightChild.isBlack);
        Assert.assertEquals(false, jeff.root.leftChild.rightChild.isBlack);
        Assert.assertEquals(false, jeff.root.leftChild.leftChild.isBlack);
        Assert.assertEquals("[15, 7, 20, 5, 10]", jeff.root.toString());

    }
}
