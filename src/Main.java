import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Digite cinco números reais:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            tree.insertKnot(num);
        }

        System.out.println("Exibindo valores da árvore:\"");
        tree.showLeftKnot();
        tree.showRoot();
        tree.showRightKnot();

        scanner.close();
    }
}
