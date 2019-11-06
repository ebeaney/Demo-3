import java.util.ArrayList;

public abstract class Piece {

    public enum Color{
        WHITE,
        BLACK
    }

    protected GameBoard board = null;

    //0-10
    protected int row;

    //0-10
    protected int column;

    protected Color color;

    public Piece(GameBoard board, Color color) {
        this.board = board;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getPosition(){
        String position = String.valueOf((char)('a'+this.column))+ (char)('a'+this.row);
        return position;
    }


    public void setPosition(String position) throws IllegalPositionException {
        //1. check position
        if(position==null||position.length()!=2)
            throw new IllegalPositionException("this position is null or its length()!=2 !!");
        char[] pos = position.toCharArray();
        char pos_column= pos[0];
        char pos_row= pos[1];
        if(!(pos_column>='a'&&pos_column<='k'&&pos_row>='a'&&pos_row<='k'))
            throw new IllegalPositionException("this position contains illegal characters or it's outside of the board !!");

        //2. set row/column
        this.row = pos_row-'a';
        this.column = pos_column-'a';
    }

    abstract public ArrayList<String> legalMoves();
}