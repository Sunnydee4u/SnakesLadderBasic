import com.sun.java.swing.plaf.windows.WindowsBorders;

public class Player {

    private String Name;
    private Integer position = 0;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


}
