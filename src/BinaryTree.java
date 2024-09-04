public class BinaryTree {
    private BinaryKnot root;

    public BinaryTree() {
        this.root = null;
    }

    // Método para insert um novo nó na árvore
    private BinaryKnot insert(BinaryKnot tree, int newKnot) {
        if (tree == null) {
            return new BinaryKnot(newKnot);
        }
        if (newKnot < tree.value) {
            tree.left = insert(tree.left, newKnot);
        } else {
            tree.right = insert(tree.right, newKnot);
        }
        return tree;
    }

    public void insertKnot(int newValue) {
        root = insert(root, newValue);
    }

    // Método para exibir os valores da subárvore esquerda
    private void showLeft(BinaryKnot tree) {
        if (tree != null) {
            showLeft(tree.left);
            System.out.println(tree.value);
        }
    }

    public void showLeftKnot() {
        showLeft(root);
    }

    // Método para exibir os valuees da subárvore direita
    private void showRight(BinaryKnot tree) {
        if (tree != null) {
            showRight(tree.right);
            System.out.println(tree.value);
        }
    }

    public void showRightKnot() {
        showRight(root);
    }

    // Método para exibir o value da root
    public void showRoot() {
        if (root != null) {
            System.out.println("Raiz: " + root.value);
        }
    }

    // Método para remove um nó da árvore
    private BinaryKnot remove(BinaryKnot tree, int item) {
        if (tree == null) {
            System.out.println("Item não localizado!");
            return null;
        }

        if (item < tree.value) {
            tree.left = remove(tree.left, item);
        } else if (item > tree.value) {
            tree.right = remove(tree.right, item);
        } else {
            if (tree.left == null) {
                return tree.right;
            } else if (tree.right == null) {
                return tree.left;
            }

            BinaryKnot temp = minValue(tree.right);
            tree.value = temp.value;
            tree.right = remove(tree.right, temp.value);
        }
        return tree;
    }

    private BinaryKnot minValue(BinaryKnot tree) {
        BinaryKnot current = tree;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void removeKnot(int item) {
        root = remove(root, item);
    }
}
