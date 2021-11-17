import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coin extends Element {
    public Coin(int x, int y){
        super(x,y);
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF00"));
        // graphics.setBackgroundColor(TextColor.Factory.fromString("#FFFF00"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "O");
    }
}
