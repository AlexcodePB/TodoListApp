import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> shoppingList = new ArrayList<>();


    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void addToCart(String article){
        this.shoppingList.add(article);
    }

    public void removeFromCart(int idxArticle) {
        if (idxArticle >= 0 && idxArticle < shoppingList.size()) {
            shoppingList.remove(idxArticle);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }
    public String printList() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shoppingList.size(); i++) {
            result.append(i).append(": ").append(shoppingList.get(i)).append("\n");
        }
        return result.toString();
    }
}
