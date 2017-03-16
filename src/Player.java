import javax.swing.*;

public class Player {
    public Player() {}

    public GameActionPerformer actionPerformer() {
        // Given a tile and the current board, what does the player do?
        // This means we need to display the tile and the board to the user inside of these functions,
        // then receive input on where they want to place the tile,
        // then enforce that they placed the tile validly,
        // then receive input on what build action they want to do,
        // then make them perform a valid build action
        //TODO: We need to get input from the "user" for these actions...

        GameActionPerformer.TileAction tileAction = (tile, board) -> {
            System.out.println("Did tile action...");
            return [0, 0]
        };

        GameActionPerformer.BuildAction buildAction = (tile, board) -> {
            System.out.println("Do build action...");
        };

        return new GameActionPerformer(tileAction, buildAction);
    }
}