public class InterfacechessPlayer {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Up ,down left,rigth,diagonal in all four direction ");
    }
}

class rook implements chessPlayer {
    public void moves() {
        System.out.println("Up ,down left,rigth, in all four direction ");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("Up ,down left,rigth,diagonal in one step direction ");
    }
}
