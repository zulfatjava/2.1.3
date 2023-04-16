import org.springframework.stereotype.Component;

@Component
public class Cat {
    public Cat () {
    }
    private String catSay;
    public String getCatSay() {
        return catSay;
    }

    public void setCatSay(String catSay) {
        this.catSay = catSay;
    }


}

